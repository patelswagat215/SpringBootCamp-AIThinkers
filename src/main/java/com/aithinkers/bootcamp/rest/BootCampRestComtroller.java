package com.aithinkers.bootcamp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aithinkers.bootcamp.utils.Employee;

@RestController
public class BootCampRestComtroller {
	
	//Demonstrating field Injection
	@Autowired
	//@Qualifier("pythonEmployeeImpl") //Demonstrating @Qualifier
	private Employee employeeimpl;
	
	/*
	 * Demonstrating constructor injection
	@Autowired
	public BootCampRestComtroller(Employee employee)
	{
		this.employeeimpl=employee;
	}*/
	
	/*@Autowired
	 * Demonstrating setter injection
	public void setEmpObjet(Employee employee)
	{
		this.employeeimpl=employee;
		
	}*/
	
	
	@GetMapping("/getEmpDtls")
	public String getEmployeeDetails()
	{
		return employeeimpl.getEmployeeDetails();
		
	}
	
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
