package com.jeongol.Conditional;

import java.util.Scanner;

public class Conditional123_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String []animals = {"I don't know.","dog", "cat", "chick"};

        System.out.print("Number? ");
        int n = sc.nextInt();

        if (n > 3 || n < 0) n = 0;

        System.out.println(animals[n]);
    }
}
