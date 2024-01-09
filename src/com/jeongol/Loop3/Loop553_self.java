package com.jeongol.Loop3;

import java.util.Scanner;

public class Loop553_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n=sc.nextInt();
        char ch = 'A';

        for (int i=n; i>0; i--) {
            for (int j=0; j<i; j++) {
                System.out.print(ch);
                ch+=1;
            }
            System.out.println();
        }
    }
}
