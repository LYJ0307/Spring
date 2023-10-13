package com.acorn.exam;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MemberService {
	
	
	@Autowired
	MemberDAO dao;
	
	
	public ArrayList<Member> getList() {
		
		
		ArrayList<Member> m = dao.getMembers();
		
		return m;
		
	}
	
	
	public void update(Member m) {
		dao.updateUser(m);
	}
	
	
	public void insert(Member m) {
		dao.insert(m);
	}
	
	
	public void delete(String id) {
		dao.delete(id);
	}
	
	
	public Member selectOne(String id) {
		Member member = dao.selectOne(id);
		return member;
	}


}
