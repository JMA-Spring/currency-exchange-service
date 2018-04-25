package com.jesus.microservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jesus.microservice.domain.ExchangeValue;

public interface ExchangeValueRepository extends JpaRepository<ExchangeValue, Long>{
	ExchangeValue findByFromAndTo(String from, String to);

}
