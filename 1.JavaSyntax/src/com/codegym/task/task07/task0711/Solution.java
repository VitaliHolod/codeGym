package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list.add(r.readLine());
        }

        for (int i = 0; i < 13; i++) {
            String temp = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            list.add(0, temp);
        }

        list.forEach(System.out::println);
    }
}

