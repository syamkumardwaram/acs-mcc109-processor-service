package com.mastercard.networkservices.acs.mcc109.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bouncycastle.asn1.cms.MetaData;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Ssi0302Request {
    private String requestId;
    private String correlationId;
    private String dateTime;
    private String processingMode;
    private MetaData metaData;
    private Payload payload;
}
