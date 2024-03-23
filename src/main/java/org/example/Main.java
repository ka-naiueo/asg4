package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "peach");
        boolean results = fruits.stream().anyMatch(fruit -> fruit.equals("apple"));
        System.out.println(results);
    }
}



