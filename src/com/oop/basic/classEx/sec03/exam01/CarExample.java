package com.oop.basic.classEx.sec03.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car 객체 생성
		Car car1 = new Car();
		car1.setModel("그랜저");
		car1.setEngine(true);
		car1.setSpeed(100);



		// 주차장 5개 만들기
		Car[] myCarArray = new Car[5];

		//Car 객체의 필드값 읽기
		System.out.println(car1.getModel() + " " + car1.getSpeed() + " " + car1.isEngine());


		// 1 - 그랜저,
		myCarArray[0] = car1;
		String[] carModel = {"그랜저", "아이오닉", "트위지", "모닝", "스파크"};

		for (int i=1; i < 5; i++) {
			Car car = new Car();
			car.setModel(carModel[i]);
			myCarArray[i] = car;
		}

		for (Car c : myCarArray) {
			System.out.println(c.getModel());
			System.out.println(c.getSpeed());
			System.out.println(c.isEngine());
		}
	}
}