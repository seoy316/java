package com.oop.basic.classEx.sec03.exam02;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car myCar1 = new Car();
		Car myCar2 = new Car("테슬라", "X", "white", 200, 80);

		//Car 객체의 필드값 읽기
		System.out.println("제작회사: " + myCar1.getCompany());
		System.out.println("모델명: " + myCar1.getModel());
		System.out.println("색깔: " + myCar1.getColor());
		System.out.println("최고속도: " + myCar1.getMaxSpeed());
		System.out.println("현재속도: " + myCar1.getSpeed());

		//Car 객체의 필드값 변경
		myCar1.setSpeed(60);
		System.out.println("수정된 속도: " + myCar1.getSpeed());
	}
}