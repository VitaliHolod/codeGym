package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Lonely arrays interact
ā
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[10];
        int[] lenth = new int[10];

        for (int a = 0; a < 10; a++) {

            str[a] = input.readLine();
            lenth[a]= str[a].length();

            System.out.println(lenth[a]);

        }

    }
}