package com.jeongol.Array2;

import java.util.stream.IntStream;

public class Array9080_ex {
    public static void main(String[] args) {
        int[][] pascal = new int[5][5];

        IntStream.range(0, 5).forEach(
                i -> IntStream.range(0, 5).forEach(j -> pascal[i][j] = 0)
        );
        pascal[0][0] = 1;

        for (int i = 1; i < pascal.length; i++) {
            for (int j = 0; j < pascal[0].length; j++) {
                if (j == 0) {
                    pascal[i][j] = 1;
                    continue;
                }
                pascal[i][j] = pascal[i - 1][j] + pascal[i - 1][j - 1];
            }
        }
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[0].length; j++) {
                if (pascal[i][j] == 0)
                    continue;
                System.out.printf("%d ", pascal[i][j]);
            }
            System.out.println();
        }
    }
}
