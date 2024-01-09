package com.collection.list.board;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {

    private List<Board> boardList = new ArrayList<>();

    public List<Board> getBoard() {
        return boardList;
    }

    public List<Board> getBoardList() {
        boardList.add(new Board("자바심화프로그래밍1", "오늘은 컬렉션 프레임워크1", "JSY"));
        boardList.add(new Board("자바심화프로그래밍2", "오늘은 컬렉션 프레임워크2", "JSY"));
        boardList.add(new Board("자바심화프로그래밍3", "오늘은 컬렉션 프레임워크3", "JSY"));
        boardList.add(new Board("자바심화프로그래밍4", "오늘은 컬렉션 프레임워크4", "JSY"));

        return boardList;
    }

    public void getBoardSize(List<Board> boardList) {
        System.out.println("현재 총 게시글의 수는 " + boardList.size() + "입니다.");
    }

    public void getBoardAll(List<Board> boardList) {
        System.out.println("\n-------------------게시글 모두 보기----------------------");
        for (Board board : boardList) {
            System.out.println("글쓴이 : " + board.getWriter());
            System.out.println("제목 : " + board.getSubject());
            System.out.println("내용 : " + board.getContent());
            System.out.println();
        }
    }

    // boardList에 글쓴 사람의 이름을 전달하여 해당 글쓴이를 확인한 후 있다면, 글쓴이의 이름과 글 주제, 내용 반환
    public void writerSearch( String name) {
        System.out.println("\n-------------------게시글 검색----------------------");
        boardList.stream()
                .filter(n-> n.getWriter().equals(name))
                .forEach(w -> System.out.println(w.getWriter() + " | " + w.getContent() + " | " +w.getSubject()));
    }

    public void boardInsert(String subject, String writer, String content) {
        System.out.println("\n-------------------게시글 추가----------------------");
        Board board = new Board(subject, writer, content);
        if (getBoardList().add(board))
            System.out.println("게시글 업로드 성공");
        else
            System.out.println("업로드 실패");
    }
}
