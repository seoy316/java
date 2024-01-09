package com.jeongol.Array1;

import java.util.Scanner;

public class Array9069_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("YEAR = ");
            int year = scanner.nextInt();

            System.out.print("MONTH = ");
            int month = scanner.nextInt();

            if (month == 0) break;

            if (month < 1 || month > 12) {
                System.out.println("잘못 입력하였습니다.");
            } else {
                int days;
                switch (month) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        days = 30;
                        break;
                    case 2:
                        days = leapYear(year) ? 29 : 28;
                        break;
                    default:
                        days = 31;
                        break;
                }
                System.out.println("입력하신 달의 날 수는 " + days + "일입니다.");
            }
        }
    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
