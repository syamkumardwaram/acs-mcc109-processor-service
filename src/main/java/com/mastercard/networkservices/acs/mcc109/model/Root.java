package com.mastercard.networkservices.acs.mcc109.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Root {
        private Ssi0302Request request;
        @JsonIgnore
        public String getPan() {
        String pan = null;
        if (request != null && request.getPayload() != null &&  request.getPayload().getDe120() != null){
            String de120 = request.getPayload().getDe120();
            String[] strArr = de120.split("\\s+");
            pan = strArr[0];
        }
        return pan;
    }
    }