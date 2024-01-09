package com.jeongol.Loop1;

import java.util.Scanner;

public class Loop9045_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        boolean state = true;

        while (state) {
            printMenu();

            int no = sc.nextInt();

            switch (no) {
                case 1:
                    System.out.println("\n입력하기를 선택하였습니다.\n");
                    break;
                case 2:
                    System.out.println("\n출력하기를 선택하였습니다.\n");
                    break;
                case 3:
                    System.out.println("\n삭제하기를 선택하였습니다.\n");
                    break;
                case 4:
                    System.out.println("\n끝내기를 선택하였습니다.\n");
                    state = false;
                    break;
                default:
                    System.out.println("\n잘못 입력하였습니다.\n");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. 입력하기");
        System.out.println("2. 출력하기");
        System.out.println("3. 삭제하기");
        System.out.println("4. 끝내기");
        System.out.print("작업할 번호를 선택하세요. ");
    }
}
