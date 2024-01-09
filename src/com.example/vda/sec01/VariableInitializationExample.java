package com.example.vda.sec01;

public class VariableInitializationExample {
	public static void main(String[] args) {
		//정수형(int)변수 value 선언
		int value = 0;
		
		//연산 결과를 변수 result의 초기값으로 대입
		value = value;
		
		//변수 result 값을 읽고 콘솔에 출력
		System.out.println(value);

		// 문자변수 ch1과 ch2 에 'A' 'B' 각각 할당하고 출력한 후
		// ch1과 ch2의 값을 swap 한 후 바뀐 값을 출력하세요
		char ch1 = 'A';
		char ch2 = 'B';
		System.out.println("ch1 =" + ch1 + "ch2 =" + ch2);

		char temp = ch1;
		ch1 = ch2;
		ch2 = temp;

		System.out.println((char) ch1 + " " + (char) ch2);
	}
}