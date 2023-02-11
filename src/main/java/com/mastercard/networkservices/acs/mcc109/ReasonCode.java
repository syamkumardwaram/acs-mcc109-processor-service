package com.mastercard.networkservices.acs.mcc109;

public enum ReasonCode {
    INVALID_DATA("Invalid Data"),
    INVALID_REQUEST("Invalid Request"),
    INSERT_PTT_FAILURE("Insertion to Process Tracking Table Unsuccessful"),
    APPLICATION_SOURCE("MCC 109"),
    DATABASE_ERROR("Server Error");
    private final String description;
    ReasonCode(String description){
         this.description = description;
    }
    public String getDescription(){
        return description;
    }
}
