package com.collection.app;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleOrderNode {

    public static void main(String[] args) {
        Node[] nodes = new Node[3];

        nodes[0] = new Node("one", 1);
        nodes[1] = new Node ("two", 3);
        nodes[2] = new Node ("three", 2);

        Arrays.sort(nodes);
        Arrays.stream(nodes).forEach(node -> System.out.println(node));

        List<SampleNumber> sampleNumberList = Arrays.asList(new SampleNumber(11,22,33),
                new SampleNumber(11,23,33),
                new SampleNumber(10,24,34)
                );
        sampleNumberList.stream().forEach(num -> System.out.println(num));

        System.out.println("-----------------------------");
        Collections.sort(sampleNumberList);

        sampleNumberList.stream().forEach(num -> System.out.println(num));

    }
}
