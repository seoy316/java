package com.jeongol.Array1;

import java.util.Scanner;

public class Array9071_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int max = -1;
        int min = 10000;

        for (int i=0; i<10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0)
                max = Math.max(max, n);
            else
                min = Math.min(min, n);
        }

        System.out.printf("%d %d", min, max);
    }
}
