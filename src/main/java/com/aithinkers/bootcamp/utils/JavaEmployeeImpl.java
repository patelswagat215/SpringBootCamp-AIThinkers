package com.aithinkers.bootcamp.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Primary
public class JavaEmployeeImpl implements Employee {
	
	@PostConstruct
	public void start()
	{
	 System.out.print("Training Started ===============================>");
	}
	
	
	@Override
	public String getEmployeeDetails() {
		
		return "Swagat Patel,Java Trainee";
	}
	
	@PreDestroy
	public void stop()
	{
	 System.out.print("Training End=======================>");
	}

}
