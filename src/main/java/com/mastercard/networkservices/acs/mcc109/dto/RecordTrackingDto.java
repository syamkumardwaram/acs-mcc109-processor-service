package com.mastercard.networkservices.acs.mcc109.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RecordTrackingDto {
    private String recordDetailId;
    private ProcessTrackingDto processTracking;
    private String processTypeCode;
    private String correlationId;
    private String recordValidationStatusCode;
    private String recordProcessingStatusCode;
    private String recordText;
    private String domainResponseRecord;
    private String domainRecordCode;
    private String editName;
    private String createdBy;
    private String createdDate;
    private String lastModifiedBy;
    private String lastModifiedDate;
    private Long version;
}
