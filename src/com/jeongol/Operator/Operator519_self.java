package com.jeongol.Operator;

import java.util.Scanner;

public class Operator519_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        a += 100;
        b %= 10;

        System.out.printf("%d %d\n", a, b);
    }
}
