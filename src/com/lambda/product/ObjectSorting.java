package com.lambda.product;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ObjectSorting {

    public static void main(String[] args) {
        List<Product> products = Arrays.asList(new Product("Laptop", 150000.0),
                                                new Product("Tablet", 500000.0),
                                                new Product("Mouse", 5000.0));

        System.out.println("====== Product List =====");
        products.forEach(System.out::println);

        List<Product> sortedProducts = products.stream().sorted(Comparator.comparing(Product::getPrice)).toList();
        System.out.println("===== Sorted Product List =====");
        sortedProducts.forEach(System.out::println);
    }
}
