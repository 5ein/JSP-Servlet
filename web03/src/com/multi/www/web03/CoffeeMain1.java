package com.multi.www.web03;

public class CoffeeMain1 {

	//프로토타입
	
	public static void main(String[] args) {
		Coffee1 c1 = new Coffee1(1000, "아메리카노");
		Coffee1 c2 = new Coffee1(2000, "라뗴");
		
		System.out.println(c1);
		System.out.println(c2);
	}

}
