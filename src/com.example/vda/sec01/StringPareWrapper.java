package com.example.vda.sec01;

public class StringPareWrapper {
    public static void main(String[] args) {

        // 1.
        String str1 = "10";
        int value1 = Integer.parseInt(str1);
        System.out.println("value1 = " + value1);

        // 2.
        String str2 = "3.14";
        float value2 = Float.parseFloat(str2);
        System.out.println("value2 = " + value2);

        // 3.
        String str3 = "true";
        boolean value3 = Boolean.parseBoolean(str3);
        System.out.println("value3 = " + value3);

        // 4.
        int num = 10;
        double flo = 3.14;
        String value4 = String.valueOf(num);
        String value5 = String.valueOf(flo);

        System.out.println("value4 = " + value4);
        System.out.println("value5 = " + value5);

    }
}
