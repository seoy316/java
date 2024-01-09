package com.example.operator;

import java.util.Arrays;
import java.util.Scanner;

public class CompareOperator {
    static Scanner in = new Scanner(System.in);
    static String []subject = {"국어", "수학", "영어", "과학"};

    public static void main(String[] args) {
        StudentEx1 st1 = new StudentEx1();
        inputStudent(st1);
        st1.printScore();

        StudentEx2 st2 = new StudentEx2();
        inputStudent(st2);
        st2.printScore();
    }

    public static abstract class Student {
        int []score = new int[4];
        String name;

        public abstract void printScore();
    }

    public static void inputStudent(Student student) {
        System.out.print("이름을 입력하세요: ");
        student.name = in.nextLine();

        for (int idx = 0; idx < subject.length; idx++) {
            System.out.printf("%s 점수: ", subject[idx]);
            student.score[idx] = in.nextInt();
            in.nextLine();
        }
    }

    public static double calScore(int[] score) {
        int total = Arrays.stream(score).sum();
        return (double) total / score.length;
    }

    public static class StudentEx1 extends Student{
        @Override
        public void printScore() {
            double avg = calScore(score);

            System.out.printf("%s 학생 평균 점수 : %.2f\n", name, avg);
            if (avg >= 80)
                System.out.println("통과");
            else
                System.out.println("실패");
        }
    }

    public static class StudentEx2 extends Student{
        @Override
        public void printScore() {
            double avg = calScore(score);
            System.out.printf("%s 학생 평균 점수 : %.2f\n", name, avg);

            if (avg >= 90)
                System.out.println("A");
            else if (avg >= 80)
                System.out.println("B");
            else if (avg >= 70)
                System.out.println("C");
            else
                System.out.println("F");
        }
    }
}
