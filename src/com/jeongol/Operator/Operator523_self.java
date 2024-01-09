package com.jeongol.Operator;

import java.util.Scanner;

public class Operator523_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("%d > %d --- %b\n", a, b, a>b);
        System.out.printf("%d < %d --- %b\n", a, b, a<b);
        System.out.printf("%d >= %d --- %b\n", a, b, a>=b);
        System.out.printf("%d <= %d --- %b\n", a, b, a<=b);
    }
}
