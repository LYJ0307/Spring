package com.acorn.ex;

public class MyCalculatorTest {
	
	//매서드
	public int add(int su1, int su2) throws Exception {	//예외처리 발생
		if(su1 < 0 || su2 < 0) {
			throw new Exception("0보다 큰 값이어야 합니다");
		}
		return su1+ su2;
	}
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		MyCalculatorTest ex = new MyCalculatorTest();
		try {
			int result = ex.add(-5, 3);
			System.out.println(result);
		} catch (Exception e) {		//예외상황 인지
			// TODO Auto-generated catch block
			System.out.println("음수 오류");		//예외상황을 만나면 비정상 종료
			e.printStackTrace();
			
			throw e;
			
		}
		
		
		System.out.println("정상 종료");
		
		
	}

}
