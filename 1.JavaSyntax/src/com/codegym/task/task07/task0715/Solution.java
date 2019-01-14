package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> list = new ArrayList<>();

        list.add("Sam");
        list.add("I");
        list.add("Am");
        list.add(1, "Ham");
        list.add(3, "Ham");
        list.add(5, "Ham");

        list.forEach(System.out::println);
    }
}
