package com;

public class Exam {

	private int eid;
	
	private String ename;
	
	private String etype;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEtype() {
		return etype;
	}

	public void setEtype(String etype) {
		this.etype = etype;
	}

	@Override
	public String toString() {
		return "Exam [eid=" + eid + ", ename=" + ename + ", etype=" + etype + "]";
	}
	
	
}
