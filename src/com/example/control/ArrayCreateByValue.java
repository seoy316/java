package com.example.control;

public class ArrayCreateByValue {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};

        // 인덱스 1의 값을 변경 : "여름" 값 변경 후 바뀐 값 출력
        season[1]="여름";


    }

    public static void printSeason(String[] season) {
        for (String s : season) System.out.println(s);
    }
}
