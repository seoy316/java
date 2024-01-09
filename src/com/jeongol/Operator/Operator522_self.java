package com.jeongol.Operator;

import java.util.Scanner;

public class Operator522_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int value1 = a == b ? 1 : 0;
        int value2 = a == b ? 0 : 1;
        System.out.printf("%d\n%d", value1, value2);

    }
}
