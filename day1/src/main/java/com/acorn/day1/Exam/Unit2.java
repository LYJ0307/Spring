package com.acorn.day1.Exam;

public class Unit2 {
	
	
	//의존성
	MulCal mul;

	
	public void setDiv(MulCal mul) {
		this.mul = mul;
	}



	// 생성자 주입(constructor injection) 생성자를 통해 함
	public Unit2(MulCal mul) {
		super();
		this.mul = mul;
	}
	
	

	public int MultipleCal(int num1, int num2) {
		int result = mul.Multiple(num1, num2);
		return result;
	}
	

}
