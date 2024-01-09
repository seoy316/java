package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop537_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        int idx = 1;
        int total = 0;
        while (idx <= n) {
            total += idx;
            idx += 1;
        }

        System.out.print(total);
    }
}
