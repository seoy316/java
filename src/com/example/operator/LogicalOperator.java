package com.example.operator;

import java.util.Scanner;

public class LogicalOperator {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String inputCode = in.nextLine();
        char charCode = inputCode.charAt(0);

        if ((65 <= charCode) & (charCode <= 90)) {
            System.out.println("대문자");
        } else if ((97<=charCode)&&(charCode<=122)) {
            System.out.println("소문자");
        } else if ((48<=charCode)&&(charCode<=57)) {
            System.out.println("0-9 사이의 숫자이군요!");
        } else {
            System.out.println("기타");
        }

        if ((charCode % 2 == 0) || (charCode % 3 == 0)) {
            System.out.printf("입력 데이터: %d , 2 or 3의 배수이군요!", charCode);
        } else {
            System.out.println("2나 3의 배수가 아니군요!");
        }

    }

}
