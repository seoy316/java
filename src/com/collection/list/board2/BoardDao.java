package com.collection.list.board2;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardDao {

    static Scanner sc = new Scanner(System.in);
    private List<Board> boards = new ArrayList<>();

    public void list(){
        System.out.println();
        System.out.println("[게시글 목록]");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-6s%-12s%-16s%-40s\n","no","writer","date","title");
        System.out.println("-------------------------------------------------");
        read();
        mainMenu();
    }

    public void mainMenu(){
        System.out.println();
        System.out.println("------------------------------------------------");
        System.out.println("1.메인 메뉴 : 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택 : ");
        String menuNo = sc.nextLine();
        System.out.println();

        switch (menuNo) {
            case "1" -> create();
            case "2" -> readOne();
            case "3" -> clear();
            case "4" -> exit();
        }
    }

    public String getCurrentDate() {
        Date nowDate = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        return simpleDateFormat.format(nowDate);
    }

    private Board createPost() {
        Board row = new Board();

        System.out.print("제목 : ");
        row.setBtitle(sc.nextLine());
        System.out.print("내용 : ");
        row.setBcontent(sc.nextLine());
        System.out.print("작성자 : ");
        row.setBwriter(sc.nextLine());

        return row;
    }

    private void create() {

        System.out.println("[새 게시물 입력]");
        Board row = createPost();

        subMenu();
        String menuNo = sc.nextLine();

        if (menuNo.equals("1")) {
            try {
                row.setBdate(getCurrentDate());
                row.setBno(boards.size()+1);
                boards.add(row);
                System.out.println("게시물 추가 완료!");
            } catch (Exception e) {
                System.out.println(e.getMessage());
                exit();
            }
        }

        list();
    }

    private void read() {
        boards.stream().forEach(board -> System.out.printf("%-6s%-12s%-16s%-40s\n",
                board.getBno(), board.getBwriter(),board.getBdate(), board.getBtitle()));
    }

    private void readOne() {
        System.out.print("[게시물 읽기]\nbno: ");
        int bno = Integer.parseInt(sc.nextLine());
        System.out.println("#################");

        boards.stream().filter(f-> f.getBno() == bno).forEach(board ->
                System.out.println("번호: " + board.getBno() + "\n" +
                        "제목: " + board.getBtitle() + "\n" +
                        "내용: " + board.getBcontent() + "\n" +
                        "작성자: " + board.getBwriter() + "\n" +
                        "날짜: " + board.getBdate()));
        readSubMenu(bno);
        list();
    }

    private void readSubMenu(int bno) {
        System.out.println("--------------------------------------");
        System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
        System.out.print("메뉴 선택: ");

        String menuNo = sc.nextLine();

        switch (menuNo) {
            case "1" -> udpate(bno);
            case "2" -> delete(bno);
            case "3" -> list();
        }
        System.out.println("--------------------------------------");
    }

    private void subMenu() {
        System.out.println("--------------------------------------------------");
        System.out.println("보조 메뉴: 1. Ok |  2. Cancel");
        System.out.print("메뉴 선택: ");
    }

    private void udpate(int bno) {
        System.out.println("[수정 내역 입력]");
        Board row = createPost();

        subMenu();
        String subMenuNo = sc.nextLine();

        if (subMenuNo.equals("1")) {
            try {
                boards.stream().filter(f->f.getBno() == bno).forEach(board -> {
                    board.setBtitle(row.getBtitle());
                    board.setBcontent(row.getBcontent());
                    board.setBwriter(row.getBwriter());
                });

            } catch (Exception e) {
                System.out.println(e.getMessage());
                exit();
            }
        } else {
            System.out.println("게시물 수정 취소!");
        }
        System.out.println("게시물 수정 완료!");
        list();
    }

    private void delete(int bno) {
        subMenu();
        String subMenuNo = sc.nextLine();
        if (subMenuNo.equals("1")) {
            try {
                boards.removeIf(b-> b.getBno() == bno);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                exit();
            }
        } else {
            System.out.println("게시물 삭제 취소!");
        }
        System.out.println("게시물 삭제 완료!");
        list();
    }

    private void clear() {
        System.out.println("[게시물 전체 삭제]");
        boards.clear();
        list();
    }

    private void exit() {
        System.out.println("\n** 게시판 종료 **");
        System.exit(0); // 정상적으로 시스템 종료
    }
}
