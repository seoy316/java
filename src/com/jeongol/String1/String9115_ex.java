package com.jeongol.String1;

import java.util.Scanner;

public class String9115_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String inputCode = sc.nextLine();

        for (int i=0; i<inputCode.length(); i++) {
            char charCode = inputCode.charAt(i);
            System.out.print(transLowerOrUpperCase(charCode));
        }
    }

    public static String transLowerOrUpperCase(char charCode) {
        String s = null;
        if ((65 <= charCode) & (charCode <= 90)) {
            s = String.valueOf(charCode).toLowerCase();
        } else if ((97 <= charCode) && (charCode <= 122)) {
            s = String.valueOf(charCode).toUpperCase();
        } else {
            s = String.valueOf(charCode);
        }
        return s;
    }
}
