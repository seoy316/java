package com.jeongol.String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9129_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String inputCode = sc.nextLine();
        double arr[] = Arrays.stream(inputCode.split(" ")).mapToDouble(Double::parseDouble).toArray();

        for (int i=0; i<arr.length; i++) {
            double n = (double) Math.round(arr[i] * 100) / 100.0;

            String []str = String.format("%.2f", n).split("\\.");
            System.out.printf("%s\n%s", str[0], str[1]);
        }
    }
}
