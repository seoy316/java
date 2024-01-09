package com.exception.exception3;

public class Account {
    private String id;
    private String pw;

    public Account(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }

    public Account() {

    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }
}
