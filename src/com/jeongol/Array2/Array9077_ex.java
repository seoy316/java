package com.jeongol.Array2;

public class Array9077_ex {
    public static void main(String[] args) {
        int [][] arr = {{3, 5, 4}, {2, 6, 7}, {8, 10, 1}};
        for (int i=0; i < arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
    }
}
