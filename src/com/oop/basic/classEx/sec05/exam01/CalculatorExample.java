package com.oop.basic.classEx.sec05.exam01;

import java.util.Scanner;

public class CalculatorExample {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		//Calculator 객체 생성
		Calculator calculator = new Calculator();

		//리턴값이 없는 powerOn() 메소드 호출
		calculator.powerOn();
		System.out.println(calculator.power);

		//plus 메소드 호출 시 5와 6을 매개값으로 제공하고,
		//덧셈 결과를 리턴 받아 result1 변수에 대입
		int result1 = calculator.sum(5,6);
		System.out.println(result1);

		//divide() 메소드 호출 시 변수 x와 y의 값을 매개값으로 제공하고,
		//나눗셈 결과를 리턴 받아 result2 변수에 대입
		int x = sc.nextInt();
		int y = sc.nextInt();
		double result2 = calculator.divide(x, y);
		System.out.println(result2);

		//리턴값이 없는 powerOff() 메소드 호출
		calculator.powerOff();
		System.out.println(calculator.power);
	}
}