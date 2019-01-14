package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            strings.add(scanner.nextLine());
        }

        Collections.sort(strings, Comparator.comparingInt(String::length));
        System.out.println(strings.get(0));

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() == strings.get(strings.size() - 1).length()) {
                System.out.println(strings.get(i));
            }
        }
    }
}
