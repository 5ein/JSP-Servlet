package com.multi.www.web03;

public class MainCar {

	public static void main(String[] args) {
		//프로토 타입 방법은 메모리가 지속적으로 늘어남(추가될때마다 늘어남)
		Car car = new Car("빨강", 10, 200); //12byte
		Car car2 = new Car("파랑", 20, 250); //12byte
		Car car3 = new Car("검정", 30, 300); //12byte
		System.out.println(car);
		System.out.println(car2);
		System.out.println(car3);
		
	}

}
