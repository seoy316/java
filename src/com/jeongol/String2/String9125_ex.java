package com.jeongol.String2;

import java.util.Scanner;

public class String9125_ex {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String arr[] =  {"champion", "tel", "pencil", "jungol", "olympiad", "class", "information", "lesson", "book", "lion"};
        String q[] = {"문자를", "문자열을"};
        for (int i =0; i<2; i++) {
            boolean state = false;
            System.out.printf("%s 입력하세요. ",q[i]);
            String str = sc.nextLine();

            for (String s : arr) {
                if (s.contains(str)) {
                    System.out.println(s);
                    state = true;
                }
            }

            if (!state)
                System.out.println("찾는 단어가 없습니다.");
            System.out.println();
        }
    }
}
