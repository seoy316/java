package com.collection.list.linkedlist;

public class Node<T> {

    public Node head = null;
    public Node next = null;
    public Node data = null;

    public Node(Node data) {
        this.data = data;
    }
}

