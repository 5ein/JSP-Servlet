package com.multi.www.web03;

public class Coffee2 {

	//싱글톤
	
	int price = 5000;
	String name = "핸드드립";
	
	//2.
	public static Coffee2 coffee2;
	
	//3.
	public static Coffee2 getInstance() {
		if (coffee2 == null) {
			coffee2 = new Coffee2();
		}
		return coffee2;
	}
	
	//1. private으로 바꿈(new(생성자)를 허용 하지 않게 막기)
	private Coffee2() { 
	}
	
}
