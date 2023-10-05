package com.acorn.day1.Exam;

public class Unit {
	
	
	//의존성
	DivCal div;

	
	public void setDiv(DivCal div) {
		this.div = div;
	}



	// 생성자 주입(constructor injection) 생성자를 통해 함
	public Unit(DivCal div) {
		super();
		this.div = div;
	}
	
	

	public int DivideCal(int num1, int num2) {
		int result = div.divide(num1, num2);
		return result;
	}
	

}
