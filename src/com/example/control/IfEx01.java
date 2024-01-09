package com.example.control;

import java.util.Scanner;

public class IfEx01 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] animals = {"I don't know", "dog", "cat", "chick"};

        System.out.print("Number? ");
        int num = sc.nextInt();

        if (num > 0 && num < 4)
            System.out.println(animals[num]);
        else
            System.out.println(animals[0]);

    }
}
