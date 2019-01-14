package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


/*
Longest string
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;

        strings.add(input.readLine());
        max = strings.get(0).length();

        for (int a = 1; a < 5; a++) {

            strings.add(input.readLine());

            if (strings.get(a).length() < max)
                max = strings.get(a).length();
        }

        for (int a = 0; a < 5; a++)
            if (strings.get(a).length() == max)
                System.out.println(strings.get(a));
    }
}