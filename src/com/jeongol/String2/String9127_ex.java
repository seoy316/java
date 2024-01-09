package com.jeongol.String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9127_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String arr[] = new String[5];
        System.out.println("단어 5개를 입력하세요.");
        for (int i=0; i<5; i++)
            arr[i] = sc.nextLine();

        Arrays.sort(arr);
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}
