package com.exception.exception3;

import groovy.swing.factory.CellEditorFactory;

import java.util.Scanner;

public class PasswordCheckTest {
    static Scanner sc= new Scanner(System.in);

    private String userID;
    private String userPW;

    public static void main(String[] args) {
        PasswordCheckTest pwCheckTest = new PasswordCheckTest();
        IDFormatTest idFormatTest = new IDFormatTest();
        String userId, userPw;

        System.out.println("회원가입");

        while (true) {
            try {
                System.out.print("아이디 입력 : ");
                userId = sc.next();
                idFormatTest.setUserID(userId);
            } catch (IDFormatException ie) {
                System.out.println(ie.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("예외 발생 프로그램 다시 시작");
            }
            break;
        }

        while (true) {
            try {
                System.out.print("비밀번호 입력 : ");
                userPw = sc.next();
                pwCheckTest.setUserPW(userPw);
            } catch (PasswordCheckException pe) {
                System.out.println(pe.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("예외 발생 프로그램 다시 시작");
            }
            break;
        }
        System.out.println(idFormatTest.getUserID() + " 회원가입 완료");

    }


    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) throws IDFormatException { // 발생한 오류는 IDFormatException이 처리하도록 throw함
        if (userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상, 20자 이하만 가능합니다.");
        }
        this.userID = userID;

    }

    public String getUserPW() {
        return userPW;
    }

    public void setUserPW(String userPW) throws PasswordCheckException {
        String regex = "[a-zA-Z0-9]";

        if (userPW == null)
            throw new PasswordCheckException("비밀번호는 null일 수 없습니다.");
        else if (userPW.matches(regex) || userPW.length() <= 5 )
            throw new PasswordCheckException("비밀번호는 6자 이상만 가능합니다.");
        this.userPW = userPW;
    }
}
