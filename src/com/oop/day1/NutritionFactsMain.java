package com.oop.day1;

public class NutritionFactsMain {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).build();
    }
}
