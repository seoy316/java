package com.jeongol.String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9122_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        String []arr = str.split(" ");

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}
