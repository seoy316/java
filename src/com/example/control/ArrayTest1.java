package com.example.control;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] intArray = null;
        double[] doubleArray= null;
        String[] stringArray = null;

        intArray = new int[4];

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;

        for(int i = 0; i < intArray.length; i++) {
            intArray[i] += 40;
            System.out.println(intArray[i]);
        }
        for(int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
        for(int i:intArray){
            System.out.println(i);
        }

        doubleArray = new double[4];
        double j = 10.0;
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = j;
            j++;
        }

        for (double arr: doubleArray)
            System.out.println(arr);


        stringArray = new String[4];

    }
}
