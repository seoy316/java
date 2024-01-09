package shinsegaeTrainning.javaBasic;

import java.util.Scanner;

public class JavaBasic8 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int balance = 0;

        while (true) {
            printMenu();
            System.out.print("선택> ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("예금액>");
                    balance += sc.nextInt();
                    break;
                }
                case 2 -> {
                    System.out.print("출금액>");
                    balance -= sc.nextInt();
                    break;
                }
                case 3-> {
                    System.out.printf("잔고>%d", balance);
                    break;
                }
                case 4-> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("-------------------------------");
        System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
        System.out.println("-------------------------------");
    }
}
