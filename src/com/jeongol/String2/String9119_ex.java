package com.jeongol.String2;

import java.util.Arrays;
import java.util.Scanner;

public class String9119_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String str = sc.nextLine();
        Arrays.stream(str.split(" ")).forEach(s-> System.out.println(s));
    }
}
