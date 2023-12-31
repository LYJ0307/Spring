package com.acorn.prac;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MemberRepository {
	
	
	@Autowired
	private SqlSession session;
	
    private static String namespace = "com.acorn.MemberMapper.";	// 별칭, 임의로 작성
    
    
    public List<Member> selectAll() {
    	return session.selectList(namespace+"selectAll");
    }
    
    
    public Member select(String id) {
    	return session.selectOne(namespace+"selectOne", id);
    }
    
    
    public int insert(Member m) {
    	return session.insert(namespace + "insert", m);
    }
    
    
    public int delete(String id) {
    	return session.delete(namespace + "delete", id);
    }
    
    
    public int update(Member m) {
    	return session.update(namespace+"update", m);
    }
    
    
    public int deleteAll() {
    	return session.delete(namespace + "deleteAll");
    }
    
   
//    public Member delete(String id) {
//    	return session.selectOne(namespace+"")
//    }
    

}
