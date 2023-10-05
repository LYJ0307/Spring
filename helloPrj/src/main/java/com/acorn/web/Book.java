package com.acorn.web;

public class Book {
	
	String name;
	String author;
	String publisher;
	
	
	public Book(String name, String author, String publisher) {
		super();
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}
	
	
	
	public Book() {}
	
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", publisher=" + publisher + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public String getPublisher() {
		return publisher;
	}



	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	

}
