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
import javax.persistence.OneToMany;
import javax.persistence.CascadeType;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "ProcessTracking")
@Table(name = "PRCSS_TRK")
public class ProcessTracking extends Audit {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator (name = "uuid", strategy = "uuid2")
    @Column(name = "PRCSS_ID")
    private String processId;
    @OneToMany(mappedBy = "processTracking", cascade = CascadeType.ALL)
    private List<RecordTracking> recordTrackingList;
    @Column(name = "PRCSS_TYPE_CD")
    private String processTypeCode;
    @Column(name = "RQST_ID")
    private String requestId;
    @Column(name = "CORLIN_ID")
    private String correlationId;
    @Column(name = "RQST_NAM")
    private String requestName;
    @Column(name = "RQST_TYPE_CD")
    private String requestTypeCode;
    @Column(name = "REPLY_DEST_NAM")
    private String replyDestinationName;
    @Column(name = "PRCSS_MODE_CD")
    private String processModeCode;
    @Column(name = "SBMT_DTTM")
    private String submitDate;
    @Column(name = "FAIL_OTTM")
    private String failedDate;
    @Column(name = "AVAIL_DTTM")
    private String availableDate;
    @Column(name = "ROST_TXT")
    private String requestText;
    @Column(name = "TOT_REC_CNT")
    private String totalRecordCount;
    @Column(name = "ACPT_REC_CNT")
    private String acceptedRecordCount;
    @Column(name = "MC_UNO_FILE_ID")
    private String mastercardUniqueFileId;
    @Column(name = "ACTL_CUST_FILE_NAM")
    private String actualCustomerFileName;
    @Column(name = "CUST_FILE_NAM")
    private String customerFileName;
    @Column(name = "SEND_CUST_ID")
    private String senderCustomerId;
    @Column(name = "FRMT_NAM")
    private String formatName;
    @Column(name = "STAT_CD")
    private String statusCode;
    @Column(name = "SPEC_NAM")
    private String specificationName;
    @Column(name = "DLVR_MTHD_CD")
    private String deliveryMethodCode;
    @Column(name = "REJ_REC_CNT")
    private String rejectedRecordCount;
    @Column(name = "RCV_DTTM")
    private String receivedDate;
    @Column(name = "DMN_RESP_TXT")
    private String domainResponse;
    @Column(name = "DMN_STAT_CD")
    private String domainStatusCode;
    @Column(name = "DMN_BODY_CD")
    private String domainBodyCode;
    @Column(name = "EDIT_NAM")
    private String editName;
}