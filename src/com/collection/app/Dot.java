package com.collection.app;

public class Dot implements Comparable<Dot>{
    int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Dot o) {
        return 0;
    }
}
