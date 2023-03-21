package com.multi.www.web03;

public class Car2 {
	//싱글톤으로 만들기!
	
	String color; //주소(4byte)
	int price; //4byte
	int speed; //4byte
	
	//하나만 제공하는객체는 static!
	//static: 하나만 변수만들때
	//public: 제공하는 car2를 아무데서나 쓸 수 있도록!
	public static Car2 car2; //Null --> 주소
	
	//싱글톤은 해당클래스에서 하나만 만들어서 제공!
	
	public static Car2 getInstance() {
		//이미 만들지 않았다면
		if(car2 == null) { //아직 안만들어진것!
			car2 = new Car2("빨강", 100, 110); //그래서 만듦
		}
		return car2; //만든거를 리턴함
	}
	
	public void run() {
		System.out.println("달리자~~~!!!.");
	}
	
	//new이용해서 객체 생성시 new Car2()를 외부에서 부를 수 없도록 해당 클래스내에서만 부르게 하가ㅗ
	//싶은 경우는 접근제어자를 private으로 바꾸어버리자.!
	//public을 private로 바꾸기
	private Car2(String color, int price, int speed) {
		this.color = color;
		this.price = price;
		this.speed = speed;
	}
	
	
}
