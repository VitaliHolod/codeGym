package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        int min, max;

        strings.add(input.readLine());
        min = max = strings.get(0).length();

        for (int a = 1; a < 10; a++) {

            strings.add(input.readLine());

            if (strings.get(a).length() > max)
                max = strings.get(a).length();

            if (strings.get(a).length() < min)
                min = strings.get(a).length();

        }

        for (int a = 0; a < 10; a++)
            if (strings.get(a).length() == min || strings.get(a).length() == max) {

                System.out.println(strings.get(a));
                break;
            }
    }
}