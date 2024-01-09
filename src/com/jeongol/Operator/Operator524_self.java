package com.jeongol.Operator;

import java.util.Scanner;

public class Operator524_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean a = sc.nextInt() == 0 ? false : true;
        boolean b = sc.nextInt() == 0 ? false : true;
        System.out.printf("%b %b", a&b, a|b);
    }
}
