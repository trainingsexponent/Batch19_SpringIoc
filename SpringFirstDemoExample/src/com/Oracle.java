package com;

public class Oracle implements Connection{

	 public Oracle() {
		// TODO Auto-generated constructor stub
		 System.out.println("Oracle  Con.");
	}
	
	@Override
	public void conON() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Connection ON");

	}

	@Override
	public void conOFF() {
		// TODO Auto-generated method stub
		System.out.println("Oracle Connection OFF");

	}

}
