package com.collection.app;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMapEx {
    //TreeMap에 학생의 이름과 점수를 입력하고 검색하는 방법을 구현해 봅시다.
    public static void main(String[] args) {
        TreeMap<String , Integer> scores = new TreeMap();
        TreeSet<Integer> sortedScores = new TreeSet<>();

        //이름(String, 점수 Integer) 저장
        scores.put("sam",75);
        scores.put("Tom",80);
        scores.put("sara",87);
        scores.put("sin",70);
        scores.put("adward",65);
        scores.put("kim",50);
        scores.put("kate",90);
        scores.put("billy",95);

        //foreach 문을 이용하여 오름차순 정렬된 scores의 학생의 이름과 점수들을 출력
        sortedScores.addAll(scores.values());

        sortedScores.forEach(s-> {
                for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                    if (entry.getValue() == s)
                        System.out.println(entry);
                }
            }
        );

        //특정 점수를 가져오기
        System.out.println(sortedScores.floor(80));

        //가장 낮은 점수 출력
        System.out.println("가장 낮은 점수 : " + sortedScores.first());

        //가장 높은 점수 출력
        System.out.println("가장 높은 점수 : " + sortedScores.last());

        //90점 아래 점수
        System.out.println("90점 이하 점수 : " + sortedScores.headSet(90));

        //90점 위 점수
        System.out.println("90점 이상 점수 : " + sortedScores.tailSet(90));

        //90점이거나 바로 아래 점수
        System.out.println("90점 이거나 바로 아래 점수 : " + sortedScores.floor(90));

        //80점 이거나 바로 위의 점수
        System.out.println("80점 이거나 바로 위 점수 : " + sortedScores.ceiling(80));

        //내림차순 정렬하기
        TreeSet<Integer> descSortedScores = new TreeSet<>(Comparator.reverseOrder());
        descSortedScores.addAll(scores.values());

        System.out.println("내림차순 정렬");
        descSortedScores.forEach(s-> {
                for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                    if (entry.getValue() == s)
                        System.out.println(entry);
                }
            }
        );

        //범위 검색(key : 이름이 b~k 학생의 이름과 점수 출력하라 )
        NavigableMap<String, Integer> keyRange = scores.subMap("b", true, "k", true);
        System.out.println("범위 검색 : 이름이 b~k");
        for (Map.Entry<String, Integer> entry : keyRange.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //범위 검색( 점수:80<= scores < 90 의 학생의 이름과 점수를 출력하라 )
        System.out.println("범위 검색 : 점수 80 이상 90 미만");
        scores.entrySet().stream().filter(score -> score.getValue() >= 80 && score.getValue() < 90)
                .forEach(s-> System.out.println(s));
    }
}
