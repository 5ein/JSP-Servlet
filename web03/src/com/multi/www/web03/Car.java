package com.multi.www.web03;

public class Car {
	//멤버변수
	//멤버메서드
	//toString() <멤버변수를 한번에 찍어주세요>
	//객체 생성시 멤버변수값 한꺼번에 넣어서 초기화 하고싶어요!
	//-> 객체 생성시 자동호출되는 메서드를 추가해주세요.
	//-> 생성자(메서드), constructor
	
	String color; //주소(4byte)
	int price; //4byte
	int speed; //4byte
	
	//생성자 만들기 Source->generater constructor using fild
	public Car(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	//toString
//	@Override
//	public String toString() {
//		return "Car [color=" + color + ", price=" + price + ", speed=" + speed + "]";
//	}
	
}
