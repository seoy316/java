package com.jeongol.Array2;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Array9079_ex {
    static Scanner sc = new Scanner(System.in);

    static class Student {
        int kr;
        int eng;
        int math;

        Student() {
            this.kr = 0;
            this.eng = 0;
            this.math = 0;
        }

        public int getTotal() {
            return this.kr + this.eng + this.math;
        }
    }

    public static void printScore(int i, Student student) {
        System.out.printf("%2d번 %3d %3d %3d %3d\n", i, student.kr, student.eng, student.math, student.getTotal());
    }

    public static void printTotalScore(Student []students) {
        int kr= 0, eng =0, math=0, total;
        for (int i=0; i<students.length; i++) {
            kr+= students[i].kr;
            eng+= students[i].eng;
            math+= students[i].math;
        }
        total = kr + eng + math;
        System.out.printf("합계 %3d %3d %3d %3d\n", kr, eng, math, total);
    }

    public static void main(String[] args) {
        Student[] st = new Student[3];

        for (int i=0; i<3; i++) {
            st[i] = new Student();
            System.out.printf("%d번째 학생의 점수 ", i+1);
            st[i].kr = sc.nextInt();
            st[i].eng = sc.nextInt();
            st[i].math = sc.nextInt();
        }

        System.out.printf("     %s %s %s %s\n", "국어", "영어", "수학", "총점");
        IntStream.range(0, 3).forEach(i -> printScore(i+1, st[i]));
        printTotalScore(st);
    }
}

