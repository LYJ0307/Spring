package com.acorn.Exam;

import static org.junit.Assert.assertTrue;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.acorn.exam.Member;
import com.acorn.exam.MemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
public class MemberDAOTest {

	
	@Autowired
	DataSource ds;
	
	@Autowired
	MemberDAO dao;
	
	//@Test
	public void test1() throws SQLException {
		Connection con = ds.getConnection();
		assertTrue(con != null);
	}
	
	@Test
	public void test2() {
		//fail("Not yet implemented");
		ArrayList<Member> list = dao.getMembers();
		assertTrue(list.size()>=1);
	}
//	
//	@Test
//	public void insert() {
//		Member m = new Member("test006", "2", "1", "1", "1111-11-11", "1");
//		int result = dao.insert(m);
//		assertTrue(result==1);
//	}
	
	
	@Test
	public void delete() {
		
		int result = dao.delete("test003");
		assertTrue(result==1);
	}
	
	
//	@Test
//	public void selectOne() {
//		Member m = dao.selectOne("test04");
//		assertTrue(m.getId().equals("test04"));
//	}
	
	
	@Test
	public void updateUser() {
		Member m = dao.updateUser("1234", "이윤정", "ss@email.com", "0307", "nnn");
	}

}
