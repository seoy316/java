package com.collection.generic;

public class Pair2<T> {

    private T first;
    private T second;

    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void swap(T first, T second) {
        T tmp = first;
        first =  second;
        second = first;
    }
}
