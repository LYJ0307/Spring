package com.acorn.Exam;

import java.sql.Connection;
 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MemberDAO {
	
	@Autowired
	DataSource ds;
	
	
	public ArrayList<Member> getMembers() {
		
		
		String sql = "select * from member_acorn";
		
		
		ArrayList<Member> list = new ArrayList<>();
		
		
		Connection con;
		try {
			con = ds.getConnection();
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pwd = rs.getString(2);
				String name = rs.getString(3);
				String email = rs.getString(4);
				String birth = rs.getString(5);
				String sns = rs.getString(6);
				Date date = rs.getDate(7);
				
				
				list.add(new Member(id, pwd, name, email, birth, sns, date));
				
			}
			
			
			rs.close();
			pst.close();
			con.close();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return list;
		
	}
	
	
	public void insert(Member m) {
		String sql = "insert into member_acorn values(?, ?, ?, ?, ?, systimestamp)";
		PreparedStatement pst = null;
		Connection con = null;
		
		
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			
			pst.setString(1, m.getId());
			pst.setString(2, m.getPwd());
			pst.setString(3, m.getName());
			pst.setString(4, m.getEmail());
			pst.setString(5, m.getBirth());
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 연결 해제
		close(pst, con);
		
	}
	
	
	
	public void delete(String id) {
		
		String sql = "delete from member_acorn where id = ?";
		PreparedStatement pst= null;
		Connection con = null;
		
		
		try {
			con = ds.getConnection();
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		close(pst, con);
		
	}
	
	 
	
	
	public int updateUser(Member m) {
		
		System.out.println( m);
		int rowCnt = 0;
		
		String sql =  "update member_acorn set pwd = ?, name = ?, email = ?, birth = ?, sns = ?, reg_date = ?, where id = ?";
		Connection con = null;
		PreparedStatement pst = null;
		System.out.println("sql = " + sql);
		
		
		try {
			con = ds.getConnection();
			System.out.println(ds);
			pst = con.prepareStatement(sql);
			pst.setString(1, m.getPwd());
			pst.setString(2, m.getName());
			pst.setString(3, m.getEmail());
			pst.setString(4, m.getBirth());
			pst.setString(5, m.getSns());
			pst.setTimestamp(6, new java.sql.Timestamp(m.getReg_date().getTime()));
			pst.setString(7, m.getId());
			rowCnt = pst.executeUpdate();
			System.out.println(rowCnt);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		} finally {
			close(pst, con);
		}

		return rowCnt;
		
	}


	private void close(AutoCloseable... acs) {
		for(AutoCloseable ac: acs) {
			try {if (ac!=null) ac.close();} catch(Exception e) {e.printStackTrace();}
		}
		
	}
	

}
