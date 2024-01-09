package com.jeongol.Operator;

import java.util.Scanner;

public class Operator521_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int tmp = a++ * --b;
        System.out.printf("%d %d %d", a, b, tmp);
    }
}
