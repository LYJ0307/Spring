package com.acorn.day1.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class ProgramTest2 {

	public static void main(String[] args) {
		
		//스프링 컨테이너 ( spring ioc container ) xml로 객체를 생성 , 주입(조립) 요청함
		ApplicationContext ac = new GenericXmlApplicationContext( "com/acorn/day1/di/setting.xml"  );
		Program program = ac.getBean(Program.class);
		int result = program.addP(5, 3);
		System.out.println(result);
		

	}

}
