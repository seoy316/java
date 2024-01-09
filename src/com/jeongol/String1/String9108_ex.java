package com.jeongol.String1;

import java.util.Scanner;

public class String9108_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            char ch = sc.nextLine().charAt(0);
            System.out.printf("%c -> %d\n", ch, (int)ch);
            if (ch == '0')
                break;
        }
    }
}
