package com.byType;

public class Employee {
	
	private int eid;
	
	private String ename;
	
	private String address;
	
	private Department department;
	
//	private Department department1;
//	
//	public Department getDepartment1() {
//		return department1;
//	}
//
//	public void setDepartment1(Department department1) {
//		this.department1 = department1;
//	}

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", department=" + department
				+ "]";
	}
	
	

}
