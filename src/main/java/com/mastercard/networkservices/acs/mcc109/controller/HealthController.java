package com.mastercard.networkservices.acs.mcc109.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.actuate.health.Status;

@RestController
public class HealthController {
    @Operation(summary="gets system health",description="gets the health of the system")
    @GetMapping(value = "/health",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Status> applicationStatus(){
        return  ResponseEntity.ok(Status.UP);
    }
}
