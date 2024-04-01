package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple", "orange", "banana", "peach");
        List<String> result = fruits.stream().filter(fruit -> fruit.endsWith("e")).toList();
        System.out.println(result);
    }
}



