package com.jeongol.Loop3;

import java.util.Scanner;

public class Loop554_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        char ch = 'A';
        int m = 1;
        for (int i=0; i<n; i++) {
            for (int j=0; j<n-i; j++) {
                System.out.printf("%d ", m);
                m+=1;
            }

            for (int j=0; j<i+1; j++) {
                System.out.printf("%c ", ch);
                ch += 1;
            }
            System.out.println();
        }
    }
}
