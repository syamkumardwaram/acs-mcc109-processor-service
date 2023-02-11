package com.mastercard.networkservices.acs.mcc109.listener;

import com.mastercard.networkservices.acs.mcc109.service.SsiMessageProcessor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class SsiMessageConsumer {
    private final SsiMessageProcessor ssiMessageProcessor;

    //@JmsListener(destination = "standalone.queue")
    public void ssiMessageListener(String jsonData) {
        try{
            System.out.println("Received Message: " + jsonData);
            ssiMessageProcessor.processSsiMessage(jsonData);
        }catch (Exception e){
            log.error("Exception Occurred {}",e.getMessage());
        }
    }
}
