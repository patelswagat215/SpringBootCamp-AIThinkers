package com.aithinkers.bootcamp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootCampRestComtroller {
	
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
