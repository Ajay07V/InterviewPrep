package com.java8;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsConcept {
    public static void main(String[] args) {
        List<List<String>> listOfLists = Arrays
                .asList(Arrays.asList("Apple", "Banana", "Cherry"),
                        Arrays.asList("Dog", "Elephant", "Fox"),
                        Arrays.asList("Grapes", "Honey", "Ice"));
        List<String> filteredList = listOfLists
                .stream()
                .flatMap(list -> list.stream())
                .filter(l -> l.length() > 5)
                .toList();
        System.out.println(filteredList);

        String s = "Ax75Ti0";
        String filteredAlphabets = s.chars()
                .filter(c -> Character.isAlphabetic(c))
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(filteredAlphabets);


    }

}
