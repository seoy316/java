package com.jeongol.Loop3;

import java.util.Scanner;

public class Loop550_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j=0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= n; i++) {
            for (int j=0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
