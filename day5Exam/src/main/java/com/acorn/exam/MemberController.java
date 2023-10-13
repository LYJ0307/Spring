package com.acorn.exam;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class MemberController {
	
	@Autowired
	MemberService s;
	
	
	//조회
	@RequestMapping("/Member")
	public String test(Model model) {
		ArrayList<Member> list = s.getList();
		model.addAttribute("list", list);
		return "member";
	}
	
	//한건조회
	@RequestMapping("/One")
	public void One(String id) {
		Member member = s.selectOne(id);
	}
		
	//등록
	@ResponseBody
	@RequestMapping(value="/reg", method=RequestMethod.POST)
	public void reg(@RequestBody Member m) {
		System.out.println(m);
		s.insert(m);
	}
	
	
	
	//삭제
	@ResponseBody
	@RequestMapping(value="/del/{id}", method=RequestMethod.DELETE)
	public void del(@PathVariable String id) {
		s.delete(id);
	}
	
	
	
	//변경
	@ResponseBody
	@RequestMapping(value="/update", method=RequestMethod.PUT)
	public void update(@RequestBody Member m) {
		s.update(m);
	}
	

}
