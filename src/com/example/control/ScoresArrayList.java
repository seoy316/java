package com.example.control;

public class ScoresArrayList {
    public static void main(String[] args) {
        int []scores = {80, 90, 87};
        printItem(scores);
    }

    public static void printItem(int []scores) {
        int total = 0;
        double avg;

        System.out.print("점수 : ");
        for (int i = 0; i<scores.length; i++) {
            System.out.printf("%d", scores[i]);
            if (i < scores.length-1)
                System.out.print(", ");
            total += scores[i];
        }
        avg = (double) total / scores.length;

        System.out.printf("\n총합 : %d\t", total);
        System.out.printf("평균 : %.1f", avg);
    }
}
