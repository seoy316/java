package com.collection.generic;

import com.example.control.Array;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getInItem(T item) {
        return items.stream().filter(f-> f.equals(item)).findFirst().orElse(null);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
