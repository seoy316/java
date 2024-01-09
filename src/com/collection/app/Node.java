package com.collection.app;

public class Node implements Comparable<Node>{

    private String content;
    private int order;

    public Node(String content, int order) {
        this.content = content;
        this.order = order;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(order, o.order);
    }


    @Override
    public String toString() {
        return "Node{" +
                "content='" + content + '\'' +
                ", order=" + order +
                '}';
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
