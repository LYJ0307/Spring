package com.acorn.exam;

 

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor  //기본생성자
@AllArgsConstructor //매개변수 있는 생성자
public class Member {
	

	private String id;
	private String pwd;
	private String name;
	private String email;
	private String birth;
	private String sns;
	private Date reg_date;
	
	
	
//	public Member(String id, String pwd, String name, String email, String birth, String sns, Date reg_date) {
//		super();
//		this.id = id;
//		this.pwd = pwd;
//		this.name = name;
//		this.email = email;
//		this.birth = birth;
//		this.sns = sns;
//		this.reg_date = reg_date;
//	}
//	
//	
	public Member(String id, String pwd, String name, String email, String birth, String sns) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.birth = birth;
		this.sns = sns;
	}
//	
//	
//	public Member() {}
//
//
//	@Override
//	public String toString() {
//		return "Member [id=" + id + ", pwd=" + pwd + ", name=" + name + ", email=" + email + ", birth=" + birth
//				+ ", sns=" + sns + ", reg_date=" + reg_date + "]";
//	}


}


