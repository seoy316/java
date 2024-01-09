package com.jeongol.Conditional;

import java.util.Scanner;

public class Conditional121_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();

        String value = n == 0 ? "zero" : n > 0 ? "plus" : "minus";
        System.out.println(value);
    }
}
