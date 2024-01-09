package com.jeongol.Operator;

import java.util.Arrays;
import java.util.Scanner;

public class Operator525_self {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int []arr = new int[3];
        for (int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        int first = arr[0];
        int max = Arrays.stream(arr).max().getAsInt();
        int avg = (int) Arrays.stream(arr).average().getAsDouble();

        int value1 = first == max && first != avg ? 1 : 0;
        int value2 = max == avg ? 1 : 0;
        System.out.printf("%d %d", value1, value2);
    }
}
