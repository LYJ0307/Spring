package com.acorn.ex;

public class MyCalculator {
	
	
	public int add(int su1, int su2) throws Exception {
		if(su1 < 0 || su2 < 0) {
			throw new Exception("0보다 큰 값이어야 합니다");
		}
		return su1+ su2;
	}
	
	

}
