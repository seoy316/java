package com.jeongol.Conditional;

import java.util.Scanner;
public class Conditional120_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        int value = a > b ? a-b : b-a;
        System.out.println(value);
    }
}
