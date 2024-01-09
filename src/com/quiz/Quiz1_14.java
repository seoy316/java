package com.quiz;

public class Quiz1_14 {
    public static class MemberService {
        public static boolean login(String id, String password) {
            return id=="hong" && password=="12345" ? true : false;
        }
        public static void logout(String id) {
            System.out.printf("%s님이 로그아웃 되었습니다.\n", id);
        }

    }

    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean result = memberService.login("hong", "12345");

        if (result) {
            System.out.println("로그인 되었습니다.");
            memberService.logout("hong");
        }
        else {
            System.out.println("id 또는 password가 올바르지 않습니다.");
        }
    }
}
