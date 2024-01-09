package com.jeongol.Operator;

import java.util.Scanner;

public class Operator518_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        for (int i=0; i<3; i++)
            total += sc.nextInt();

        System.out.printf("sum : %d\n", total);
        System.out.printf("avg : %d\n", total/3);
    }
}
