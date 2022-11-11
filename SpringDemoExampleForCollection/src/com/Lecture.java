package com;

public class Lecture {

	private int lid;
	
	private String lname;
	
	private String lstart;
	
	private String lend;

	public int getLid() {
		return lid;
	}

	public void setLid(int lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getLstart() {
		return lstart;
	}

	public void setLstart(String lstart) {
		this.lstart = lstart;
	}

	public String getLend() {
		return lend;
	}

	public void setLend(String lend) {
		this.lend = lend;
	}

	@Override
	public String toString() {
		return "Lecture [lid=" + lid + ", lname=" + lname + ", lstart=" + lstart + ", lend=" + lend + "]";
	}
	
	
}
