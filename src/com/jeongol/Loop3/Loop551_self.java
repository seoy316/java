package com.jeongol.Loop3;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Loop551_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        for (int i=n; i>0; i--) {
            IntStream.range(0, i).forEach(m -> System.out.printf(" "));
            for (int j=0; j<i; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
