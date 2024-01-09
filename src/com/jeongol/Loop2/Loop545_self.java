package com.jeongol.Loop2;

import java.util.Scanner;

public class Loop545_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        int three = 0;
        int five = 0;

        for (int i=0; i<10; i++) {
            n = sc.nextInt();
            if (n%3==0)
                three += 1;
            if (n%5==0)
                five += 1;
        }
        System.out.printf("Multiples of 3 : %d\n", three);
        System.out.printf("Multiples of 5 : %d\n", five);
    }
}
