package com.jesus.microservice.controllers;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jesus.microservice.domain.ExchangeValue;
import com.jesus.microservice.services.ExchangeValueService;

@RestController
public class CurrencyExchangeController {

	@Value("${server.port}")
	private String port;
	
	@Autowired
	private ExchangeValueService exchangeValueService;

	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
		
		ExchangeValue exchangeValue = exchangeValueService.findByFromAndTo(from, to);
		exchangeValue.setPort(Integer.parseInt(port));
		
		return exchangeValue;
	}

}
