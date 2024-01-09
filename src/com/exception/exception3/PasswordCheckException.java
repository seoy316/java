package com.exception.exception3;


// 비밀번호가 null인 경우
// 문자열로만 이루어져있을 때 5자 이하인 경우
public class PasswordCheckException extends Exception{
    public PasswordCheckException(String message) {
        super(message);
    }
}
