package com.codegym.task.task07.task0704;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
Flip the array

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

