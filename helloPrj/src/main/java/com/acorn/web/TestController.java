package com.acorn.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class TestController {
	
	@GetMapping("/msg1")
	public String msg1(Model model1, Model model2, Model model3) {
		
		model1.addAttribute("message1", "파이팅해야지");
		model2.addAttribute("message2", "오늘은 수요일");
		model3.addAttribute("message3", "금요일은 언제 오나요");
		
		
		return "msg1";
		
	}
	
	
	
	@GetMapping("/bookdata1")
	public Book data1() {
		
		Book book = new Book("천개의 파랑", "천선란", "허블");
		
		return book;
		
	}
	
	

}
