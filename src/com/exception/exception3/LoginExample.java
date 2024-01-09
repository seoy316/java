package com.exception.exception3;

import java.util.Scanner;

public class LoginExample {
    static Scanner sc= new Scanner(System.in);
    static Account user = new Account();

    public static void main(String[] args) {
        System.out.println("회원가입");
        createId();
        createPassword();
        System.out.println(user.getId() + " 회원가입 완료");

        System.out.println("로그인");
        login();
        System.out.println("로그인 완료");
    }

    private static void createPassword() {
        while (true) {
            try {
                System.out.print("비밀번호 입력 : ");
                String userPw = sc.next();
                setUserPW(userPw);
            } catch (PasswordCheckException pe) {
                System.out.println(pe.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println("예외 발생 프로그램 다시 시작");
                continue;
            }
            break;
        }
    }

    private static void createId() {
        while (true) {
            try {
                System.out.print("아이디 입력 : ");
                String userId = sc.next();
                setUserID(userId);
            } catch (IDFormatException ie) {
                System.out.println(ie.getMessage());
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("예외 발생 프로그램 다시 시작");
                continue;
            }
            break;
        }
    }

    public static void login() {
        while (true) {
            try {
                System.out.print("아이디 : ");
                String id = sc.next();
                System.out.print("비밀번호 : ");
                String pw = sc.next();

                Account user = new Account(id, pw);

                verifyLoginInfo(user);
            } catch (NotExitIDWrongPasswordException ne) {
                System.out.println(ne.getMessage());
                continue;
            }
            break;
        }
    }

    public static void setUserID(String userID) throws IDFormatException { // 발생한 오류는 IDFormatException이 처리하도록 throw함
        if (userID == null) {
            throw new IDFormatException("아이디는 null일 수 없습니다.");
        } else if (userID.length() < 8 || userID.length() > 20) {
            throw new IDFormatException("아이디는 8자 이상, 20자 이하만 가능합니다.");
        }
        user.setId(userID);
    }

    public static void setUserPW(String userPW) throws PasswordCheckException {
        String regex = "[a-zA-Z0-9]";

        if (userPW == null)
            throw new PasswordCheckException("비밀번호는 null일 수 없습니다.");
        else if (userPW.matches(regex) || userPW.length() <= 5 )
            throw new PasswordCheckException("비밀번호는 6자 이상만 가능합니다.");
        user.setPw(userPW);
    }

    public static void verifyLoginInfo(Account input) throws NotExitIDWrongPasswordException {
        if (!user.getId().equals(input.getId()) && !user.getPw().equals(input.getPw())) {
            throw new NotExitIDWrongPasswordException("로그인 정보가 일치하지 않습니다.");
        }
    }
}
