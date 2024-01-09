package com.exception.exception3;

import java.util.Scanner;

public class IDFormatTest {
    static Scanner sc= new Scanner(System.in);

    private String userID;

    public static void main(String[] args) {
        IDFormatTest test = new IDFormatTest();
        String userID;

        System.out.println("회원가입");

        try {
            userID = sc.next();
            test.setUserID(userID);
        } catch (IDFormatException ie) {
            System.out.println(ie.getMessage());
        } catch (Exception e) {
            System.out.println("예외 발생 프로그램 다시 시작");
        }

        System.out.println(test.getUserID() + " 회원가입 완료");

    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) throws IDFormatException { // 발생한 오류는 IDFormatException이 처리하도록 throw함
        if (userID == null)
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        else if (userID.length() < 8 || userID.length() > 20)
            throw new IDFormatException("아이디는 8자 이상, 20자 이하만 가능합니다.");

        this.userID = userID;
    }
}
