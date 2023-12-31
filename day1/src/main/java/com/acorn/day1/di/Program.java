package com.acorn.day1.di;

public class Program {
	
	
	
	// 의존성 dependency
	Calculator calculator;

	
	// 생성자 주입(constructor injection) 생성자를 통해 함
	public Program(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	
	public Program() {}

	
	// 세터 주입 setter injection
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	
	
	
	public int addP(int num1, int num2) {
		int result;
		result = calculator.add(num1, num2);
		return result;
	}
	
	

}
