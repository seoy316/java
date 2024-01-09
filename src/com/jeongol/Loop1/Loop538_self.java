package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop538_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.print("number? ");
            int n = sc.nextInt();

            if (n == 0 )
                break;

            String value = n > 0 ? "positive integer" : "negative number";
            System.out.println(value);

        }
    }
}
