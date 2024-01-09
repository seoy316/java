package com.collection.list.board;

import java.util.List;

public class BoardMain {
    public static void main(String[] args) {

        BoardDao dao = new BoardDao();
        List<Board> boardList = dao.getBoardList();

        // dao에 전체 게시물의 수를 제공하는 메소드 boardSize() 작성하여 전체 게시물의 수를 확인해 주세요.
        dao.getBoardSize(boardList);

        // dao에 전체 글을 조회하는 메소드인 getBoardAll()
        dao.getBoardAll(boardList);

        // boardList에 글쓴 사람의 이름을 전달하여 해당 글쓴이를 확인한 후 있다면, 글쓴이의 이름과 글 주제, 내용 반환
        dao.writerSearch("JSY");

        // dao에 boardInsert(String subject, String writer, String content) 메서드를 작성하여 새로운 글 추가기능
        dao.boardInsert("java", "good", "jsy");
    }
}
