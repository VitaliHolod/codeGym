package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");
        list.add("1");

        System.out.println(list.size());

        list.forEach(System.out::println);
    }
}
