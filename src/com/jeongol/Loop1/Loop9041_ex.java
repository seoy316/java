package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop9041_ex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        while (true) {
            System.out.printf("점수를 입력하세요. ");
            int score = sc.nextInt();

            if (score < 0 || score > 100)
                break;

            if (score >= 80)
                System.out.println("축하합니다. 합격입니다.");
            else
                System.out.println("죄송합니다. 불합격입니다.");

        }
    }
}
