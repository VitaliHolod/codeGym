package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int a = 0; a < 5; a++) {

            list.add(input.nextLine());
        }

        list.remove(2);

        Collections.reverse(list);

        list.forEach(System.out::println);
    }
}
