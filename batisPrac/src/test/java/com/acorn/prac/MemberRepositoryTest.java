package com.acorn.prac;

import static org.junit.Assert.fail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/test.xml" , "file:src/main/webapp/WEB-INF/spring/**/test2.xml"} )
@Log4j
public class MemberRepositoryTest {
	
	
	@Autowired
	 MemberRepository dao;

	
	
	@Test
	public void test() {
		  log.info( dao.selectAll().size());
	}
	
	
	@Test
	public void test2() {
		//log.info(dao.select("test01").getName().equals("이윤정"));
		log.info(dao.select("002"));
	}
	
	
//	@Test
//	public void test3() {
//		log.info(dao.insert(new Member("test02", "7890", "이윤")));
//	}
	
	
//	@Test
//	public void test4() {
//		log.info(dao.delete("002"));
//	}
	
	
//	@Test
//	public void test5() {
//		log.info(dao.update(new Member("test02", "5554", "옹골찬")));
//	}
	
	
	@Test
	public void test6() {
		log.info(dao.deleteAll());
	}
	
}
