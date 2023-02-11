package com.mastercard.networkservices.acs.mcc109.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MetaData {
    private String payloadType;
    private String payloadVersion;
}
