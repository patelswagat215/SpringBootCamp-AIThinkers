package com.aithinkers.bootcamp.ci.demo;

import org.springframework.stereotype.Component;

@Component
public class EmployeeImpl implements Employee {

	@Override
	public String getEmployeeDetails() {
		
		return "Swagat Patel,Java Trainee";
	}

}
