package com.mastercard.networkservices.acs.mcc109.repositories;

import com.mastercard.networkservices.acs.mcc109.entities.RecordTracking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface RecordTrackingRepository extends JpaRepository<RecordTracking,String> {
}
