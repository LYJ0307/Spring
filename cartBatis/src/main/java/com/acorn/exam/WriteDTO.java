package com.acorn.exam;

public class WriteDTO {
	

	int number;
	String name;
	String content;
	
	
	public WriteDTO(int number, String name, String content) {
		super();
		this.number = number;
		this.name = name;
		this.content = content;
	}
	
	
	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	
	public WriteDTO() {}
	
	
	@Override
	public String toString() {
		return "WriteDTO [number=" + number + ", name=" + name + ", content=" + content + "]";
	}
	

}
