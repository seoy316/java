package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop633_self {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String []country = {"none", "Seoul", "Washington", "Tokyo", "Beijing"};

        while (true) {
            printMenu();
            int n = sc.nextInt();

            if (n < 1 || n > 4 ) {
                System.out.println("\n" + country[0]+"\n");
                break;
            }
            else
                System.out.println("\n" + country[n]+"\n");
        }
    }

    public static void printMenu() {
        System.out.println("1. Korea");
        System.out.println("2. USA");
        System.out.println("3. Japan");
        System.out.println("4. China");
        System.out.print("number? ");
    }
}
