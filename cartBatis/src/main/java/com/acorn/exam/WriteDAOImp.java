package com.acorn.exam;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class WriteDAOImp {
	
	
	@Autowired
	private SqlSession session;
	private static String namespace = "acorn.orderMapper.";
	
	
	//고객 이름을 입력으로 받음
	public List<WriteDTO> selectWrite(String name) throws Exception {
		return session.selectList(namespace+"selectWrite" , name);
	}
	
	
	
	
	

}
