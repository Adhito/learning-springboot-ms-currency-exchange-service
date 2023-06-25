package com.learningspringbootms.mscurrencyexchangeservice.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learningspringbootms.mscurrencyexchangeservice.CurrencyExchange;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retreiveExchangeValue(
			@PathVariable String from, 
			@PathVariable String to) {
		CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		String port = environment.getProperty("local.server.port");
		currencyExchange.setEnvirontment(port);
		return currencyExchange;
	}

}
