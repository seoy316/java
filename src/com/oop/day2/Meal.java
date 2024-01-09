package com.oop.day2;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item: items)
            cost += item.price();
        return cost;
    }

    public void showItems() {
        items.stream().forEach(i->
                System.out.println("이름 : " + i.name() +
                                    "\n가격 : " + i.price() +
                                    "\n포장 : " + i.packing().pack()));
    }
}
