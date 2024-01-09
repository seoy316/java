package com.jeongol.String1;

import java.util.Scanner;

public class String9116_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();

        for (String s: str.split(" ")) {
            System.out.println(s);
        }
    }
}
