package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop540_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            int n = sc.nextInt();

            if (n % 3 == 0) {
                n = n/3;
                System.out.printf("\n%d\n", n);
            }

            if (n == -1)
                break;
        }
    }
}
