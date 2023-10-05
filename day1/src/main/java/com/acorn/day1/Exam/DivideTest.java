package com.acorn.day1.Exam;

public class DivideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DivCal div = new CCal();
		Unit unit = new Unit(div);
		int result = unit.DivideCal(10, 5);
		System.out.println(result);

	}

}
