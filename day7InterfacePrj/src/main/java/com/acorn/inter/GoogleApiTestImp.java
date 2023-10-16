package com.acorn.inter;

import org.springframework.stereotype.Component;


@Component
public class GoogleApiTestImp implements GoogleApi {

	
	@Override
	public double[] 위도경도구하기() {
		// TODO Auto-generated method stub
		return new double[] {37.4997187 , 127.0348982};
	}		// 이거를 가지고 테스트함

}
