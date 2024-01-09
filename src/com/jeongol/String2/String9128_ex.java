package com.jeongol.String2;

import java.util.Scanner;

public class String9128_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        for (int i=0; i<2; i++) {
            String input = sc.nextLine();
            String arr[] = input.split(" ");

            if (arr[i].contains(".")) {
                System.out.printf("%.2f + %.2f = %.2f\n", Double.parseDouble(arr[0]), Double.parseDouble(arr[1]),
                                    Double.parseDouble(arr[0]) +Double.parseDouble(arr[1]));
            }
            else {
                System.out.printf("%s + %s = %d\n", arr[0], arr[1], Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]));
            }
        }
    }
}
