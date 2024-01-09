package com.jeongol.Operator;

import java.util.Scanner;

public class Operator520_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        System.out.printf("%d\n%d", n++, ++n);
    }
}
