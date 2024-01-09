package com.jeongol.Array1;

import java.util.Scanner;

public class Array9070_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int max = -1;
        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            if (n > max) {
                max = n;
            }
        }

        System.out.println(max);
    }
}
