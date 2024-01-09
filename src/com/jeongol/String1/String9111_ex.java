package com.jeongol.String1;

import java.util.Scanner;

public class String9111_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = "jungol olympiad";

        for (int i=0; i<5; i++) {
            int idx = sc.nextInt();
            System.out.print(str.charAt(idx));
        }
    }
}
