package com.mastercard.networkservices.acs.mcc109.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class Mcc109ExceptionHandler extends Throwable {
    public static final String EXCEPTION_OCCURRED = "Exception Occurred";

/*    public Mcc109ExceptionHandler(ErrorController errorController) {
        super((Throwable) errorController);
    }*/
/*
    @ExceptionHandler({ValidationException.class})
    public ResponseEntity<Object> handleValidationException(ValidationException ex) {
        return new ResponseEntity<>(ErrorResponse.of(ex.getErrors()), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler({Mcc109Exception.class})
    public ResponseEntity<Object> handleMcc109Exception(Mcc109Exception ex) {
        return new ResponseEntity<>(ErrorResponse.of(ex.getErrors()), HttpStatus.BAD_REQUEST);
    }*/
}
