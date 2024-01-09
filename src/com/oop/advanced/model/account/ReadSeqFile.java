package com.oop.advanced.model.account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadSeqFile extends Frame implements ActionListener {

    private TextField account, name, balance;
    private Button next, done;
    private DataInputStream input; // 필드에 입력된 account, name, balance 의 스트링 객체를 담는 객체

    ReadSeqFile() {
        super("고객의 파일을 읽겠습니다.");
        try {
            input = new DataInputStream(new FileInputStream("client.doc"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e1) {
            System.err.println(e1.toString());
            System.exit(1);
        }

        setSize(250, 150);
        setLayout(new GridLayout(4, 2));
        account = new TextField();
        account.setEditable(false);
        add(account);
        add(new Label("이름"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        add(new Label("잔고"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("출력");
        next.addActionListener(this);
        add(done);
        setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) readRecord();
        else closeFile();
    }

    public void closeFile() {}

    public void readRecord() {}
}
