package com;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class College {

	private int cid;
	
	private String cname;
	
	private List<Department> departments;
	
	private Set<Staff> staffs;
	
	private Map<Integer, Lecture> map;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Set<Staff> getStaffs() {
		return staffs;
	}

	public void setStaffs(Set<Staff> staffs) {
		this.staffs = staffs;
	}

	public Map<Integer, Lecture> getMap() {
		return map;
	}

	public void setMap(Map<Integer, Lecture> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", departments=" + departments + ", staffs=" + staffs
				+ ", map=" + map + "]";
	}
	
	
}
