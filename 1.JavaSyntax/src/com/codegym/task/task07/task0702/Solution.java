package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String arr[] = new String[10];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = scanner.next();
        }

        Collections.reverse(Arrays.asList(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}