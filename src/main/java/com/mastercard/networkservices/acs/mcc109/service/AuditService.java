package com.mastercard.networkservices.acs.mcc109.service;

import com.mastercard.networkservices.acs.mcc109.entities.Config;
import com.mastercard.networkservices.acs.mcc109.entities.ProcessTracking;
import com.mastercard.networkservices.acs.mcc109.exception.Error;
import com.mastercard.networkservices.acs.mcc109.exception.Mcc109Exception;
import com.mastercard.networkservices.acs.mcc109.repositories.ConfigRepository;
import com.mastercard.networkservices.acs.mcc109.repositories.ProcessTrackingRepository;

import javax.ws.rs.NotFoundException;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static com.mastercard.networkservices.acs.mcc109.ReasonCode.APPLICATION_SOURCE;

@Component
@RequiredArgsConstructor
@Slf4j
public class AuditService {
    private final ConfigRepository configRepository;
    /*@Autowired
    ConfigRepository configRepository;*/
    private final ProcessTrackingRepository processTrackingRepository;
    /*@Autowired
    ProcessTrackingRepository processTrackingRepository;*/
    private static final String RECORD_CREATED_STATUS_CODE = "RECEIVED";
    private static final String REQUEST_NAME = "SSI_0302_MCC109";

    public Config getConfig() {
        Config config = configRepository.findConfigByRequestName(REQUEST_NAME)
                .orElseThrow(
                        () -> new NotFoundException(String.format("Config data not found for request name '%s' ",
                                REQUEST_NAME)));
        log.info("Fetched config info {} from config table",config);
        return config;
    }

    public String insetSsiRequestToProcessTrackingTable(String ssiMessage) throws Mcc109Exception {
        ProcessTracking saveProcessTrackingDetails;
        String processId;
        try {
            ProcessTracking processTracking = ProcessTracking.builder().requestText(ssiMessage).build();
            log.debug("Saving received ssi message in process tracking table {}", processTracking);
            saveProcessTrackingDetails = processTrackingRepository.save(processTracking);
            processId = saveProcessTrackingDetails.getProcessId();
            log.info("SSI message saved in process tracking table and created process id: {}", processId);
        }
        //TODO: Add Junit for below catch block
        catch (Exception e) {
            //throw new Mcc109Exception(Error.of(APPLICATION_SOURCE.getDescription()));
            throw new Mcc109Exception(Error.of(APPLICATION_SOURCE.getDescription(),
                    "Server error," +
                            "AuditService::Failed to save in PTT table",
                    false,
                    e.getMessage()));
            //log.error("test",e.getMessage());
        }
        return processId;
    }


}
