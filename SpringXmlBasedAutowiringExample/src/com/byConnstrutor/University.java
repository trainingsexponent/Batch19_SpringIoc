package com.byConnstrutor;

public class University {

	private int uid;
	
	private String uname;
	
	private College college;
	
	private College college1;

	public University(int uid, String uname, College college) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.college = college;
	}
	

	public University(int uid, String uname, College college, College college1) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.college = college;
		this.college1 = college1;
	}

	public int getUid() {
		return uid;
	}
	
	public String getUname() {
		return uname;
	}

	public College getCollege() {
		return college;
	}

	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", college=" + college + ", college1=" + college1 + "]";
	}
	
	
}
