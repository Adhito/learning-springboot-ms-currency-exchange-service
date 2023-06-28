package com.learningspringbootms.mscurrencyexchangeservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learningspringbootms.mscurrencyexchangeservice.entity.CurrencyExchange;

public interface CurrencyExchangeRepository 
	extends JpaRepository<CurrencyExchange, Long> {
	CurrencyExchange findByFromAndTo(String from, String to);
	
}
