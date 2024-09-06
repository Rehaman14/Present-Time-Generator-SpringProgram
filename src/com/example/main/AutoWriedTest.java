package com.example.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.config.Appconfig;
import com.example.sbeans.GeneratorTime;

public class AutoWriedTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		GeneratorTime generator=ctx.getBean("wrg",GeneratorTime .class);
		String msg=generator.generatorMassage("rehaman");
		System.out.println("result coming"+msg);

	}

}
