package com.collection.generic;

public interface Comparator<T> extends Comparable<T>{
    @Override
    int compareTo(T o);
}
