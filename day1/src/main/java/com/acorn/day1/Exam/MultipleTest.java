package com.acorn.day1.Exam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MultipleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ac = new GenericXmlApplicationContext("com/acorn/day1/Exam/setting.xml");
		Unit2 unit = ac.getBean(Unit2.class);
		int reulst = unit.MultipleCal(5, 3);
		System.out.println(reulst);
		

	}

}
