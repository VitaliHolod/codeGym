package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

/* 
In decreasing order
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        int max, min;

        for (int a = 0; a < 20; a++)
            for (int b = 0; b < 19; b++) {

                min = Math.min(array[b], array[b + 1]);
                max = Math.max(array[b], array[b + 1]);
                array[b] = max;
                array[b + 1] = min;
            }
    }
    }
