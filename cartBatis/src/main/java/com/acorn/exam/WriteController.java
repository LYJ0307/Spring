package com.acorn.exam;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class WriteController {
	
	
	@Autowired
	WriteService serv;
	
	
	@RequestMapping("/writeList")
	public String writeList(HttpServletRequest request) {
		
		
		try {
			HttpSession session = request.getSession();
			String name = "이윤정";		// 고객 이름을 내 이름으로 설정
			System.out.println(serv.writeList(name));
			Map<String, List> writeMap = serv.writeList(name);
			session.setAttribute("writeMap", writeMap);	// 글 내용 정보 출력
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return "writeList";
		
	}
	

}
