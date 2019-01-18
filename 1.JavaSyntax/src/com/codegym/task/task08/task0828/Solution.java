package com.codegym.task.task08.task0828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Month number

*/

public class Solution {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        String numberMonth = scanner.nextLine();

        Map<String, String> map = new HashMap<>();

        map.put("1", "January");
        map.put("2", "February");
        map.put("3", "March");
        map.put("4", "April");
        map.put("5", "May");
        map.put("6", "June");
        map.put("7", "July");
        map.put("8", "August");
        map.put("9", "September");
        map.put("10", "October");
        map.put("11", "November");
        map.put("12", "December");

        String s = map.values().stream().filter(v -> v.equals(numberMonth)).toString();

        System.out.println(s);


        for (Map.Entry<String, String> entry: map.entrySet()){
            if (map.equals(numberMonth)) {
                System.out.println(entry.getValue() + " is month "+ entry.getKey());
            }
        }
    }
}
