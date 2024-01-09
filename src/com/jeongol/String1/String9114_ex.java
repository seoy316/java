package com.jeongol.String1;

import java.util.Scanner;

public class String9114_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            String inputCode = sc.nextLine();
            char charCode = inputCode.charAt(0);

            if ((65 <= charCode) & (charCode <= 90)) {
                System.out.println("대문자입니다.");
            } else if ((97 <= charCode) && (charCode <= 122)) {
                System.out.println("소문자입니다.");
            } else if ((48 <= charCode) && (charCode <= 57)) {
                System.out.println("숫자문자입니다.");
            } else {
                System.out.println("영문, 숫자 이외의 문자입니다.");
                break;
            }
        }
    }
}
