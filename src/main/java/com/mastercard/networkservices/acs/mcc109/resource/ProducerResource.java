package com.mastercard.networkservices.acs.mcc109.resource;

import com.ibm.mq.jms.MQQueue;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.*;
import javax.jms.JMSException;

/*@RestController
@RequestMapping("/rest/publish")
@RequiredArgsConstructor
@Slf4j
@EnableJms*/
//@Configuration
public class ProducerResource {
   // private final JmsTemplate jmsTemplate;
    //@Autowired
    //private JmsTemplate jmsTemplate;

    //JmsTemplate jmsTemplate = new JmsTemplate();


   // private final MQQueue queue;
/*
    @PostMapping
    public String publish(@RequestBody String message) throws JMSException {
        try{
            //MQQueue queue = new MQQueue("REQUEST_QUEUE");
            jmsTemplate.convertAndSend(queue, message);

        }catch (Exception e){
            e.printStackTrace();
        }
        return "Published Successfully";
    }*/
}
