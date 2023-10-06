package com.acorn.day2.DBTest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class MovieController {
	
	
	@Autowired
	MovieService service;
	
	
	@RequestMapping("/movie")
	public String mvlist(Model model) {
		
		ArrayList<Movie> mvlist = service.getList();
		model.addAttribute("list", mvlist);
		System.out.println(model);
		
		return "MovieTest";
		
	}
	

}
