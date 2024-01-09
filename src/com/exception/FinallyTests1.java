package com.exception;

import java.util.Scanner;

public class FinallyTests1 {
    static Scanner sc = new Scanner(System.in);
    static void returnintFinally(int number1, int number2) {
        try {
            double result = number1/number2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        } finally {

        }
    }

    public static void main(String []args) {
        System.out.println("[프로그램 시작]");
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();

        returnintFinally(number1, number2);
        System.out.println("[프로그램 종료]");

    }
}
