package com.codegym.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Duplicating words

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());
        }

        ArrayList<String> result = doubleValues(list);

        result.forEach(System.out::println);
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> theList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            theList.add(list.get(i));
            theList.add(list.get(i));
        }
        return theList;
    }
}
