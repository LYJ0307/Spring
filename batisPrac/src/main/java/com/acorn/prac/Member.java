package com.acorn.prac;

import java.util.Date;

import com.acorn.prac.Member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  //기본생성자
@AllArgsConstructor //매개변수 있는 생성자
public class Member {
	
	String id;
	String pwd;
	String name;
	
	
	
	

}
