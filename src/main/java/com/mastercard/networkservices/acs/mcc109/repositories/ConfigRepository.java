package com.mastercard.networkservices.acs.mcc109.repositories;

import com.mastercard.networkservices.acs.mcc109.entities.Config;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface ConfigRepository extends JpaRepository<Config,String> {
  Optional<Config> findConfigByRequestName(String requestName);
  List<Config> findConfigsByPayloadType(String payloadType);
}
