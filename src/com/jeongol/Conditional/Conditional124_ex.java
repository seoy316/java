package com.jeongol.Conditional;

import java.util.Scanner;

public class Conditional124_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int year = sc.nextInt();
        int []years = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        System.out.println(years[year]);
    }
}
