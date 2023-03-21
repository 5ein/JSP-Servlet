package com.multi.www.web03;

public class MainCar3 {

	public static void main(String[] args) {
		//싱글톤
		Car2 car2; //12byte
		for (int i = 0; i < 1000; i++) {
			car2 = Car2.getInstance(); //new가 아님!
			System.out.println(car2); //주소확인! == 주소가 다 똑같음
		}
		System.out.println("메모리크기>> " + 12 * 1);
	}

}
