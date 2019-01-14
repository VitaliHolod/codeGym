package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int countP = 0;
        int countN = 0;

        for (int i : arr) {
            if (i > 0) {
                countP++;
            }
            if (i < 0) countN++;

        }
        System.out.println("Number of negative numbers: " + countN);
        System.out.println("Number of positive numbers: " + countP);
    }
}
