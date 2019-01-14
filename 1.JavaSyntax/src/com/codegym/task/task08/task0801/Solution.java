package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<String> strings = new HashSet<>();

        strings.add("watermelon");
        strings.add("banana");
        strings.add("cherry");
        strings.add("pear");
        strings.add("cantaloupe");
        strings.add("blackberry");
        strings.add("ginseng");
        strings.add("strawberry");
        strings.add("iris");
        strings.add("potato");

        strings.forEach(System.out::println);
    }
}
