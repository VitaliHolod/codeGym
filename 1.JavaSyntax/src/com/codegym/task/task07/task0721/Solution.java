package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Stream;

/*
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[20];
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(reader.readLine());

            if (arr[i] > maximum) {
                maximum = arr[i];
            }
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
