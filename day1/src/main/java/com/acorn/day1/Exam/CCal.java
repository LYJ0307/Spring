package com.acorn.day1.Exam;

public class CCal implements DivCal {

	@Override
	public int divide(int su1, int su2) {
		System.out.println("나누기 계산기");
		return su1/su2;
	}

}
