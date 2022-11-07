package com;

public class Mysql implements Connection{

	public Mysql() {
		// TODO Auto-generated constructor stub
		System.out.println("Mysql Con.");
	}
	
	@Override
	public void conON() {
		// TODO Auto-generated method stub
		System.out.println("MySQL Connection ON");
	}

	@Override
	public void conOFF() {
		// TODO Auto-generated method stub
		System.out.println("MySQL Connection Off");
	}

}
