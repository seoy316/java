package com.jeongol.Conditional;

import java.util.Scanner;

public class Conditional122_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int year = sc.nextInt();

        if (year % 400 ==0 || (year % 4 == 0 && year % 100 != 0))
            System.out.println("leap year");
        else
            System.out.println("common year");
    }
}
