package com.jeongol.Array2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array9075_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int []arr = new int[11];
        IntStream.rangeClosed(0, 10).forEach(i-> arr[i] = 0);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            arr[n%10] += 1;
        }

        for (int i=0; i<11; i++) {
            if (arr[i] > 0)
                System.out.printf("%d : %d개\n", i, arr[i]);
        }
    }
}
