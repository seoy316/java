package com.example.vda.sec01;

import java.util.Scanner;

public class ExamPro {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d\n", ++a, b--);
        System.out.printf("%d %d", a, b);
    }
}
