package com.acorn.day2.DBTest;

public class Movie {
	


	String genre;
	String title;
	String acotors;
	
	
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAcotors() {
		return acotors;
	}
	public void setAcotors(String acotors) {
		this.acotors = acotors;
	}
	
	
	public Movie(String genre, String title, String acotors) {
		super();
		this.genre = genre;
		this.title = title;
		this.acotors = acotors;
	}


	
	
	public Movie() {}
	
	
	
	@Override
	public String toString() {
		return "Movie [genre=" + genre + ", title=" + title + ", acotors=" + acotors + "]";
	}
	

}
