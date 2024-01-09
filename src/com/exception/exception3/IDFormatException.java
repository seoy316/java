package com.exception.exception3;


// 아이디가 null 이거나 지정 범위를 벗어난 아이디가 입력되었을 경우 발생시키는 사용자 정의 Exception
public class IDFormatException extends Exception{
    public IDFormatException(String message) {
        super(message);
    }
}
