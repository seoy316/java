package com.collection.list.student;

import java.util.Scanner;

public class StudentMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // 학생 정보 생성
        StudentDao studentDao = new StudentDao();

        studentDao.inputStudentInform();

        studentDao.studentExamInsert();

        studentDao.studentRecordPrint();

        studentDao.studentUpdate();

        studentDao.studentPrintAll();

        String stuno = sc.next();
        studentDao.studentPickPrint(stuno);

    }
}
