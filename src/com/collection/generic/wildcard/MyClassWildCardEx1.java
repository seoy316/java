package com.collection.generic.wildcard;

import com.oop.interface_3.B;

import java.util.ArrayList;
import java.util.List;

public class MyClassWildCardEx1 {

/*    public static void printList(List<?> list) {
        list.forEach(System.out::println);
    }*/

    public static <T extends Comparable<T> & Cloneable> void printList(List<?> list) {
        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

        // board 게시글을 저장한 리스트를 만들어 해당 글 내용(content)을 출력하도록
        List<Board> boardList = new ArrayList<>();

        BoardDao boardDao = new BoardDao();
        Board board1 = new Board("java", "seo", "goood");
        Board board2 = new Board("board", "yoon", "gooooood!");
        Board board3 = new Board("generic", "jang", "good!");

        boardList.add(board1);
        boardList.add(board2);
        boardList.add(board3);

        printList(boardList);

    }



}

