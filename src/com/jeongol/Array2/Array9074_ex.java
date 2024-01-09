package com.jeongol.Array2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array9074_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int []arr = new int[11];
        IntStream.range(1, 11).forEach(i-> arr[i] = 0);

        while (true) {
            int n= sc.nextInt();

            if (n > 10 || n < 1)
                break;
            arr[n] += 1;
        }

        for (int i=1; i<arr.length; i++) {
            if (arr[i] > 0)
                System.out.printf("%d : %d개\n", i, arr[i]);
        }
    }
}
