package com.acorn.exam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

public class WriteService {
	
	
	@Autowired
	WriteDAOImp dao;
	
	
	public Map<String, List> writeList(String name) throws Exception{
		
		Map<String, List> writeMap = new HashMap<String, List> ();
		
		List<WriteDTO> writeList = dao.selectWrite(name);
		
		
		writeMap.put("writeMap", writeList);
		
		
		return writeMap;
		
				
	}
	
	
}
