package com.jeongol.String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9126_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String inputCode = sc.nextLine();
        String arr[] = inputCode.split(" ");

        String value1 = size(arr);
        String value2 = compare(arr[0], arr[1]) ? "같" : "같지 않";

        System.out.printf("%s 가(이) 더 큽니다.\n", value1);
        System.out.printf("앞의 세 문자가 %s습니다.", value2);

    }

    public static String size(String []str) {
        Arrays.sort(str);
        return str[1];
    }

    public static boolean compare(String str1, String str2) {
        return str1.substring(0, 3).equals(str2.substring(0, 3));
    }
}
