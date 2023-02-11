package com.mastercard.networkservices.acs.mcc109.exception;

import static com.mastercard.networkservices.acs.mcc109.ReasonCode.APPLICATION_SOURCE;

public class Mcc109Exception extends Exception{
    public Mcc109Exception(Error e){
     super(e);
    }
/*
    public Mcc109Exception(String reasonCode, String description){
        this(reasonCode,description,"");
    }

    public Mcc109Exception(Error e){
        super(e);
    }
    public Mcc109Exception(String reasonCode, String description, String details) {
        super(Error.of(APPLICATION_SOURCE.getDescription(),reasonCode,description,false,details));
    }

    public Mcc109Exception(String reasonCode, String description, String s) {
    }*/
}
