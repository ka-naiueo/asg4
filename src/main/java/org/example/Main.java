package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> fluits = List.of("apple", "orange", "banana", "peach");
        boolean results = fluits.stream().anyMatch(fluit -> fluit.equals("apple"));
        System.out.println(results);
    }
}



