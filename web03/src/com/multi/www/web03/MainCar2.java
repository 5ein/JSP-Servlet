package com.multi.www.web03;

public class MainCar2 {

	public static void main(String[] args) {
		//프로토 타입 방법은 메모리가 지속적으로 늘어남(추가될때마다 늘어남)
		Car car; //12byte
		for (int i = 0; i < 1000; i++) {
			car = new Car("빨강" + i, 10, 200);
			System.out.println(car); //주소확인! == 주소가 다 다름
		}
		System.out.println("메모리크기>> " + 12 * 1000);
		//프로토타입으로 하면 생긴만큼 메모리크기가 자꾸 늘어남.(서버메모리를 많이 쓰게됨)
		
	}

}
