package com.acorn.day2.DBTest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MovieDAO {
	
	@Autowired
	DataSource ds;
	
	
	public ArrayList<Movie> select() {
		
		
	String sql = "select * from movie_tbl";
	
	
	ArrayList<Movie> movielist = new ArrayList<>();
	
	try {
		Connection con = ds.getConnection();
		PreparedStatement pst = con.prepareStatement(sql);
		ResultSet rs = pst.executeQuery();
		
		while(rs.next()) {
			
			String genre = rs.getString(1);
			String title = rs.getString(2);
			String actors = rs.getString(3);
			
			movielist.add(new Movie(genre, title, actors));
		}
		
		rs.close();
		pst.close();
		con.close();
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	return movielist;
	
	

	}
	
	
//	public static void main(String[] args) {
//		
//		MovieDAO dao = new MovieDAO();
//		ArrayList<Movie> movie = dao.select();
//		System.out.println(movie);
//		
//	}


}
