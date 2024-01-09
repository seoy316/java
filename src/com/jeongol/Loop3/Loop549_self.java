package com.jeongol.Loop3;

import java.util.Scanner;

public class Loop549_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int total = 0;
        int cnt =0;

        int i=1;
        while (total < n ) {
            if (i % 2 != 0) {
                cnt += 1;
                total += i;
            }
            i++;
        }
        System.out.printf("%d %d", cnt, total);
    }
}

