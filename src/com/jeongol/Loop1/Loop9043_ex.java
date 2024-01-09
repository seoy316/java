package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop9043_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int total = 0;
        int cnt = 0;

        while (true) {
            int num = sc.nextInt();
            if (num == 0)
                break;

            if (num % 2 != 0) {
                total += num;
                cnt += 1;
            }
        }
        System.out.printf("홀수의 합 = %d\n", total);
        System.out.printf("홀수의 평균 = %d", total/cnt);
    }
}
