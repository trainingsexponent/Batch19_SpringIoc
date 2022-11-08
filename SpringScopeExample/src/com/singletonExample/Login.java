package com.singletonExample;

public class Login {

	private String uname;
	
	private String pass;
	
	public Login() {
	System.out.println("Login Constructor Called");
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [uname=" + uname + ", pass=" + pass + "]";
	}
	
	
}
