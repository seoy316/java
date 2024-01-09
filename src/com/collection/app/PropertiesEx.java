package com.collection.app;

import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) throws IOException {

        Properties properties = new Properties();

        // database.properties 파일 로드
        properties.load(PropertiesEx.class.getResourceAsStream("database.properties"));

        // 주어진 키에 대한 값 읽기
        String driver = properties.getProperty("driver");


    }
}
