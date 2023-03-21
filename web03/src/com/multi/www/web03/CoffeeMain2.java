package com.multi.www.web03;

public class CoffeeMain2 {

	//싱글톤
	
	public static void main(String[] args) {
		Coffee2 c1 = Coffee2.getInstance();
		System.out.println(c1);
		
		Coffee2 c2 = Coffee2.getInstance();
		System.out.println(c2);
		
	}
}
