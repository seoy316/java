package com.jeongol.String2;

import java.util.Scanner;

public class String9124_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String str = sc.nextLine();
        String a = str.split(" ")[0];
        String b = str.split(" ")[1];

        System.out.println(b.substring(0, 3)+a.substring(3));
        System.out.println(b + a.substring(0, 3));
    }
}
