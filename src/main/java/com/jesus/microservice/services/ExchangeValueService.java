package com.jesus.microservice.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jesus.microservice.dao.ExchangeValueRepository;
import com.jesus.microservice.domain.ExchangeValue;

@Service
public class ExchangeValueService {
	
	@Autowired
	private ExchangeValueRepository exchangeValueRepository;
	
	public ExchangeValue findByFromAndTo(String from, String to) {
		return exchangeValueRepository.findByFromAndTo(from, to);
	}


}
