package com.jeongol.Array1;

import java.util.Arrays;
import java.util.Scanner;

public class Array9072_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int []scores = new int[10];
        for (int i=0; i<scores.length; i++) {
            scores[i] = sc.nextInt();
        }

        int total = Arrays.stream(scores).sum();
        System.out.printf("총점 = %d\n", total);
        System.out.printf("평균 = %.1f\n", (double) total/10);

    }
}
