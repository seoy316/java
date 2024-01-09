package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop539_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int total = 0;
        int cnt = 0;

        while (true) {
            int n = sc.nextInt();

            total += n;
            cnt += 1;

            if (n >= 100)
                break;
        }
        System.out.printf("%d\n%.1f", total, (double) total/cnt);
    }
}
