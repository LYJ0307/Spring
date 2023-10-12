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

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
public class MemberDAOTest {

	
	@Autowired
	DataSource ds;
	
	
	MemberDAO dao;
	
	@Test
	public void test1() throws SQLException {
		Connection con = ds.getConnection();
		assertTrue(con != null);
	}
	
	
	public void test2() {
		//fail("Not yet implemented");
		ArrayList<Member> list = dao.getMembers();
		assertTrue(list.size()>=1);
	}

}
