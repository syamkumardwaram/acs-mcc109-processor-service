package com.mastercard.networkservices.acs.mcc109;

import com.mastercard.networkservices.acs.mcc109.service.SsiMessageProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
//@EnableJms
public class AcsMcc109ProcessorServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(AcsMcc109ProcessorServiceApplication.class, args);
        System.out.println("Welcome");
    }
}
