package com.mastercard.networkservices.acs.mcc109.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SsiResponse {
    private String responseCode;
    private String rejectedOn;
    private String originCode;
    private String domainCode;
    private String specificationName;
    private String editName;
}
