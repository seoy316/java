package com.collection.list.student;

import java.util.*;
import java.util.stream.Collectors;

public class StudentDao {

    private String name;
    private String stuno;
    private static List<Student> stuList = new ArrayList<>();

    static Scanner sc = new Scanner(System.in);

    // 학생 정보 입력
    public void inputStudentInform() {
        System.out.println("------------학생 정보 등록------------");

        System.out.println("학생 정보를 입력하세요.");

        System.out.print("학번 : ");
        String stuno = sc.next();

        System.out.print("이름 : ");
        String name = sc.next();

        if (stuList.contains(stuno)) {
            System.out.println("이미 존재하는 학번 입니다.");
            return;
        }
        Student student = new Student(stuno, name);
        Subject subject = new Subject(0,0,0);
        student.setSubjects(subject);
        stuList.add(student);

        System.out.println("등록되었습니다.");
    }

    // 성적 데이터 입력
    public void studentExamInsert() {
        System.out.println("------------성적 데이터 입력------------");

        Subject subject = new Subject();

        System.out.println("학번을 입력하세요.");
        String stuno = sc.next();

        if (existStuno(stuno)) return;

        System.out.println("성적 데이터를 입력하세요.");

        System.out.print("국어 : ");
        subject.setKor(sc.nextInt());
        System.out.print("영어 : ");
        subject.setEng(sc.nextInt());
        System.out.print("수학 : ");
        subject.setMath(sc.nextInt());

        stuList.stream().filter(s->s.getStuno().equals(stuno)).forEach(
                stu -> stu.setSubjects(subject));
    }

    private boolean existStuno(String stuno) {
        Student student = stuList.stream().filter(f-> f.getStuno().equals(stuno)).findFirst().orElse(null);
        if (student == null ) {
            System.out.println("존재하지 않는 학번입니다.");
            return true;
        }
        return false;
    }

    // 평균, 총점 계산
    public void studentRecordPrint() {
        System.out.println("------------평균 및 총점------------");

        int total = 0;
        for (Student student: stuList) {
            Subject subject = student.getSubjects();
            total += subject.getEng() + subject.getKor() + subject.getMath();
        }

        System.out.println("평균 점수 : " + (double) (total / stuList.size())/3);
        System.out.println("총점 : " + total );
    }

    // 성적 데이터 수정
    public void studentUpdate() {
        System.out.println("------------성적 데이터 수정------------");
        Subject subject = new Subject();

        System.out.println("점수를 수정할 학생의 학번을 입력해주세요.");
        String stuno = sc.next();

        if (existStuno(stuno)) return;

        System.out.println("수정할 점수를 입력하세요.");
        System.out.print("국어 : ");
        subject.setKor(sc.nextInt());

        System.out.print("영어 : ");
        subject.setEng(sc.nextInt());

        System.out.print("수학 : ");
        subject.setMath(sc.nextInt());

        stuList.stream().filter(s->s.getStuno().equals(stuno)).forEach(
                stu -> stu.setSubjects(subject));

    }

    // 학생 전체 정보 및 성적 출력
    public void studentPrintAll() {
        System.out.println("------------전체 학생 정보 및 성적 출력------------");

        for (Student student : stuList) {
            System.out.println("학번 : " + student.getStuno() +
                                "이름 : " + student.getName() +
                                "점수 : " + student.getSubjects());

        }

    }

    // 학번으로 학생 정보 및 성적 출력
    public void studentPickPrint(String stuno) {
        System.out.println("------------학생 정보 및 성적 출력------------");

        if (existStuno(stuno)) return;

        stuList.stream().filter(s->s.getStuno().equals(stuno)).forEach(
                stu -> System.out.println("학번 : " + stu.getStuno() +
                        "이름 : " + stu.getName() +
                        "점수 : " + stu.getSubjects()));

    }

}
