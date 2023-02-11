package com.mastercard.networkservices.acs.mcc109.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Payload {
    private String de2;
    private String de7;
    private String de11;
    private String de33;
    private String de63;
    private String de91;
    private String de96;
    private String de101;
    private String de120;
    private String internalErrorCode;
    private String requestRawMessage;
}
