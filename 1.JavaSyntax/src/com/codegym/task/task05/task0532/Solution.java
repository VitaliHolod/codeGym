package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        int maximum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {

            if (maximum < arr[i]) {
                maximum = Math.max(arr[i], maximum);
            }
        }
        System.out.println(maximum);
    }
}
