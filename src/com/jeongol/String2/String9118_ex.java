package com.jeongol.String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9118_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] arr = new String[5];

        for (int i=0; i<5; i++)
            arr[i] = sc.nextLine();

        Arrays.stream(arr).forEach(i-> System.out.println(i));
    }
}
