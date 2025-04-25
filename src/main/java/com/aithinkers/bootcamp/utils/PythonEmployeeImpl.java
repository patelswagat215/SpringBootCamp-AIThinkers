package com.aithinkers.bootcamp.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class PythonEmployeeImpl implements Employee {

	@Override
	public String getEmployeeDetails() {
		
		return "Swagat Patel,Python Trainee";
	}

}
