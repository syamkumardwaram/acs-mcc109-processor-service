package com.mastercard.networkservices.acs.mcc109.controller;

import com.mastercard.networkservices.acs.mcc109.exception.ValidationException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
@Slf4j
public class AcsMqController {
    public String publish(@RequestBody String message) throws Exception{
        try{
            return "Published Successfully";
        }catch (Exception ve){
            log.error("Exception occurred {}",ve.getMessage());
            throw ve;
        }
    }
}
