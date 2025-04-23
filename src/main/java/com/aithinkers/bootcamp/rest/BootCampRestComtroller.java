package com.aithinkers.bootcamp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootCampRestComtroller {
	
	//Inject properties
	@Value("${company.name}")
	private String name;
	
	@Value("${company.domain}")
	private String domain;
	
	@GetMapping("/companyDetails")
	public String getAuthorInfo()
	{
		return "Company name:-"+name +" "+"Company Domain:-"+domain;
	}
	
	@GetMapping("/")
	public String getInformation()
	{
		return "AIThinkers will start its Spring Boot camp on April";
	}
	
	@GetMapping("/welcome")
	public String getWelcomeMessage()
	{
		return "Welcome to AIThinkers  Spring Boot Camp 2025";
	}

	@GetMapping("/fortunate")
	public String getFortunate()
	{
		return "I am feeling fortunate to join AIThinkers";
	}
}
