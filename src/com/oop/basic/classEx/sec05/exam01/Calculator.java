package com.oop.basic.classEx.sec05.exam01;

public class Calculator {
    boolean power = false;

    public Calculator() {}

    public Calculator(boolean power) {
        this.power = power;
        if (this.power == true) powerOn();

    }

	//리턴값이 없는 메소드 선언
    public void powerOn() {
        this.power = true;
        System.out.println("전원이 켜졌습니다.");
    }

	//리턴값이 없는 메소드 선언
    public void powerOff() {
        this.power = false;
        System.out.println("전원이 꺼졌습니다.");
    }

    //호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 int를 리턴하는 메소드 선언
    public int sum(int a, int b) {
        return a+b;
    }


	//호출 시 두 정수 값을 전달받고,
	//호출한 곳으로 결과값 double을 리턴하는 메소드 선언
    public double divide(int a, int b) {
        return (double) a/b;
    }

}