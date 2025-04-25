package com.aithinkers.bootcamp.utils;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ReactJSEmployeeImpl implements Employee {

	@Override
	public String getEmployeeDetails() {
		
		return "Swagat Patel,ReactJS Trainee";
	}

}
