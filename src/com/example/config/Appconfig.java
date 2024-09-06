package com.example.config;

import java.time.MonthDay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
@ComponentScan(basePackages="com.example.sbeans")
public class Appconfig 
{
     @Bean(name="lmomth")
	public MonthDay createmothday() {
		System.out.println("");
		return MonthDay.now();
	}

}
