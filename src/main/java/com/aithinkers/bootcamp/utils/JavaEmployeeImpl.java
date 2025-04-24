package com.aithinkers.bootcamp.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary//Demonstrating @Primary
@Lazy
public class JavaEmployeeImpl implements Employee {

	@Override
	public String getEmployeeDetails() {
		
		return "Swagat Patel,Java Trainee";
	}

}
