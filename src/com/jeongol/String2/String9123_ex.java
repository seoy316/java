package com.jeongol.String2;

import java.util.Scanner;

public class String9123_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        String str = sc.nextLine();
        String a = str.split(" ")[0];
        String b = str.split(" ")[1];

        System.out.println(b+a);
    }
}
