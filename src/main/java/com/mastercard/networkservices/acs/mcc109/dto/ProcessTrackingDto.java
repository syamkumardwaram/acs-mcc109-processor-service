package com.mastercard.networkservices.acs.mcc109.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ProcessTrackingDto {
        private String processId;
        private List<RecordTrackingDto> recordTrackingList;
        private String processTypeCode;
        private String requestId;
        private String correlationId;
        private String requestName;
        private String requestTypeCode;
        private String mastercardUniqueFileId;
        private String actualCustomerFileName;
        private String customerFileName;
        private String senderCustomerId;
        private String formatName;
        private String statusCode;
        private String specificationName;
        private String deliveryMethodCode;
        private String replyDestinationName;
        private String processModeCode;
        private String failedDate;
        private String availableDate;
        private String requestText;
        private Integer totalRecordCount;
        private Integer acceptedRecordCount;
        private Integer rejectedRecordCount;
        private String receivedDate;
        private String domainResponse;
        private String domainStatusCode;
        private String domainBodyCode;
        private String editName;
        private String createdBy;
        private String createdDate;
        private String lastModifiedBy;
        private String lastModifiedDate;
}
