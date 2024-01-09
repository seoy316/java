package com.jeongol.Array1;

import java.util.Scanner;

public class Array9067_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = new int[10];

        for (int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.printf("%d %d %d", arr[2], arr[4], arr[arr.length-1]);
    }
}
