package com.mastercard.networkservices.acs.mcc109.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.Instant;
@MappedSuperclass
@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Audit {
    @Column(name = "CRTE_USER_ID")
    protected String createdBy="ACS";
    @CreatedDate
    @Column(name = "CRTE DTTM")
    protected Instant createdDate = Instant.now();
    @Column(name = "LST_UPDT_USER_ID")
    protected String lastModifiedBy = "ACS";
    @LastModifiedDate
    @Column(name = "LST_UPDT_DTTM")
    protected Instant lastModifiedDate = Instant.now();
    @Version
    @Column(name = "VER_NUM")
    private Long version;
}
