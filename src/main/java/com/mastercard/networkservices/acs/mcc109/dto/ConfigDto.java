package com.mastercard.networkservices.acs.mcc109.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ConfigDto {
    private String configId;
    private String requestName;
    private String requestTypeCode;
    private String processTypeCode;
    private String formatName;
    private String specificationName;
    private String deliveryMethodCode;
    private String taskTypeCode;
    private String payloadType;
    private String payloadVersion;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
}