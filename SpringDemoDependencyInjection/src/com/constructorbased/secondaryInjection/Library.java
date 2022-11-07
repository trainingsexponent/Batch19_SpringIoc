package com.constructorbased.secondaryInjection;

public class Library {
	
	
	private int lid;
	
	private String lname;
	
	private Book book;

	public Library(int lid, String lname, Book book) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.book = book;
	}

	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", book=" + book + "]";
	}
	
	

}
