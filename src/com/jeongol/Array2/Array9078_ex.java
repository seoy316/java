package com.jeongol.Array2;

import java.util.Scanner;

public class Array9078_ex {
    static Scanner sc= new Scanner(System.in);

    public static void main(String[] args) {
        int [][]arr1 = new int[3][3];
        int [][]arr2 = new int[3][3];

        for (int i=0; i<3; i++) {
            System.out.printf("첫 번째 배열 %d행 ", i+1);
            for (int j=0; j<3; j++)
                arr1[i][j] = sc.nextInt();
        }

        for (int i=0; i<3; i++) {
            System.out.printf("두 번째 배열 %d행 ", i+1);
            for (int j=0; j<3; j++)
                arr2[i][j] = sc.nextInt();
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<3; j++) {
                System.out.printf("%d ", arr1[i][j]+arr2[i][j]);
            }
            System.out.println();
        }
    }
}
