package com.mastercard.networkservices.acs.mcc109.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.CascadeType;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "RecordTracking")
@Table(name = "REC_TRK")
public class RecordTracking extends Audit {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "REC_DTL_ID")
    private String recordDetailId;
    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn(name = "PRCSS_ID")
    ProcessTracking processTracking;
    @Column(name = "PRCSS_TYPE_CD")
    private String processTypeCode;
    @Column(name = "CORLTN_ID")
    private String correlationId;
    @Column(name = "REC_VLOTN_STAT_CD")
    private String recordValidationStatusCode;
    @Column(name = "REC_PRCSS_STAT_CD")
    private String recordProcessingStatusCode;
    @Column(name = "REC_TXT")
    private String recordText;
    @Column(name = "DMN_RESP_REC_TXT")
    private String domainResponseRecord;
    @Column(name = "DMN_REC_CD")
    private String domainRecordCode;
    @Column(name = "EDIT_NAM")
    private String editName;
}
