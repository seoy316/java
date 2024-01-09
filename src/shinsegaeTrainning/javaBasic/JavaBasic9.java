package shinsegaeTrainning.javaBasic;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class JavaBasic9 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int scores[] = new int[0];

        while (true) {
            printMenu();
            System.out.print("선택> ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    System.out.print("학생수>");
                    int cnt = sc.nextInt();
                    scores = new int[cnt];
                    break;
                }
                case 2 -> {
                    for (int i=0; i<scores.length; i++) {
                        System.out.printf("scores[%d]> ", i);
                        scores[i] = sc.nextInt();
                    }
                    break;
                }
                case 3-> {
                    for (int i=0; i<scores.length; i++)
                        System.out.printf("scores[%d]> %d\n", i, scores[i]);
                    break;
                }
                case 4-> {
                    System.out.printf("최고 점수: %d\n", Arrays.stream(scores).max().getAsInt());
                    System.out.printf("평균 점수: %.1f\n", (double) Arrays.stream(scores).sum()/scores.length);
                    break;
                }
                case 5-> {
                    System.out.println("프로그램 종료");
                    return;
                }
                default -> System.out.println("다시 선택하세요");
            }
            System.out.println();
        }
    }

    public static void printMenu() {
        System.out.println("------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("------------------------------------------------");
    }
}
