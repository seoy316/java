package com.jeongol.Loop2;

import java.util.Arrays;
import java.util.Scanner;

public class Loop546_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int []score = new int[n];

        for (int i=0; i<n; i++)
            score[i] = sc.nextInt();

        double avg = (double) Arrays.stream(score).sum() / n;
        System.out.printf("avg : %.1f\n", avg);

        if (avg >= 80)
            System.out.println("pass");
        else
            System.out.println("fail");
    }
}
