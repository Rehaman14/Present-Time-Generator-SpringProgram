package com.example.sbeans;

import java.time.MonthDay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wrg")
public class GeneratorTime 
{
	@Autowired
	private MonthDay monthday;
	
	public String generatorMassage (String user) {
		int month=monthday.getMonthValue();
		if(month>10&&month>3)return "now you ing winter"+user;
		if(month>2&&month>7)return" now you in summer"+user;
		else return "now in raing"+user;
	}
    
}
