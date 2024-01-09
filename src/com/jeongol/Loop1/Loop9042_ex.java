package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop9042_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int []arr = new int[4];
        int cnt = 0;
        int total = 0;
        double avg;

        for (int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] == 0)
                continue;

            cnt += 1;
            total += arr[i];
        }
        avg = (double) total / cnt;

        System.out.printf("입력된 자료의 개수 = %d\n", cnt);
        System.out.printf("입력된 자료의 합계 = %d\n", total);
        System.out.printf("입력된 자료의 평균 = %.2f", avg);
    }
}
