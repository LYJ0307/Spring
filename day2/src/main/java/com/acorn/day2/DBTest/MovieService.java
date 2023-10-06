package com.acorn.day2.DBTest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieService {
	
	@Autowired
	MovieDAO dao;
	
	public ArrayList<Movie> getList() {
		
		MovieService service = new MovieService();
		ArrayList<Movie> mvlist = dao.select();
		
		
		return mvlist;
		
	}

}
