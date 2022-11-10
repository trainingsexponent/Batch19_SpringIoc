package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class University {

	private int uid;
	
	private String uname;
	
	@Autowired
	@Qualifier(value = "e")
	private Exam exam;
	
	@Autowired
	@Qualifier(value = "e1")
	private Exam exam2;
	

	public Exam getExam2() {
		return exam2;
	}

	public void setExam2(Exam exam2) {
		this.exam2 = exam2;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Exam getExam() {
		return exam;
	}

	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Override
	public String toString() {
		return "University [uid=" + uid + ", uname=" + uname + ", exam=" + exam + ", exam2=" + exam2 + "]";
	}
	
	
}
