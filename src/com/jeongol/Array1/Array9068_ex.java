package com.jeongol.Array1;

import java.util.Scanner;

public class Array9068_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int arr[] = new int[101];
        int idx = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            arr[idx] = n;
            idx++;
        }

        for (int i=1; i<idx; i++) {
            if (i%2==0)
                System.out.printf("%d ", arr[i]);
        }
    }
}
