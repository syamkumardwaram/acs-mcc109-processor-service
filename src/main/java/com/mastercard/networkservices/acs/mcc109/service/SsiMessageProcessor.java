package com.mastercard.networkservices.acs.mcc109.service;

import com.mastercard.networkservices.acs.mcc109.exception.Mcc109Exception;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
@Slf4j
@RequiredArgsConstructor
@Component
public class SsiMessageProcessor {
    private final AuditService auditService;
   /* @Autowired
    AuditService auditService;*/
    public void processSsiMessage(String ssiMessage) throws Mcc109Exception {
        String processId = auditService.insetSsiRequestToProcessTrackingTable(ssiMessage);
    }
}
