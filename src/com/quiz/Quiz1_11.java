package com.quiz;

public class Quiz1_11 {
    public static void main(String[] args) {
        int[][] array = {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88},
        };
        int total = 0;
        int cnt = 0;
        double avg;

        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                total += j;
                cnt += 1;
            }
        }

        avg = (double) total / cnt;
        System.out.println("전체 합 : " + total);
        System.out.println("평균 : " + avg);
    }
}
