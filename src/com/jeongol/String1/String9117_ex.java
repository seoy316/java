package com.jeongol.String1;

import java.util.Scanner;

public class String9117_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();

        for (int i=1; i<=str.length(); i++) {
            System.out.print(str.substring(i));
            System.out.print(str.substring(i-1, i-1));
            for (int j=0; j < i; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
