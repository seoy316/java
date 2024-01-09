package com.jeongol.String2;

import java.util.Scanner;

public class String9121_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("문자를 입력하세요. ");
        String arr[] = {"champion", "class"};

        String str = sc.nextLine();
        for (String a : arr) {
            if (a.charAt(0) == str.charAt(0))
                System.out.println(a);
        }
    }
}
