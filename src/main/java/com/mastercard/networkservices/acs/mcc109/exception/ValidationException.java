package com.mastercard.networkservices.acs.mcc109.exception;

public class ValidationException extends Exception{
    ValidationException(Error error){
        super(error);
    }
    public ValidationException(String reasonCode, String description){
        super();
    }
   /* ValidationException(String reasonCode,String description,String details){
        //super(Error.of
    }*/
}