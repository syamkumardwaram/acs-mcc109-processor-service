package com.mastercard.networkservices.acs.mcc109.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "Config")
@Table(name = "CONFIG")
public class Config extends Audit {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "CONFIG_ID")
    private String configId;
    @Column(name = "RQST NAM")
    private String requestName;
    @Column(name = "RQST_TYPE_CD")
    private String requestTypeCode;
    @Column(name = "PRCSS_TYPE_CD")
    private String processTypeCode;
    @Column(name = "FRMT_NAM")
    private String formatName;
    @Column(name = "SPEC_NAM")
    private String specificationName;
    @Column(name = "DLVR_MTHD_CD")
    private String deliveryMethodCode;
    @Column(name = "TASK_TYPE_CD")
    private String taskTypeCode;
    @Column(name = "PYLD_TYPE_TXT")
    private String payloadType;
    @Column(name = "PYLD VER_NUM")
    private String payloadVersion;
}
