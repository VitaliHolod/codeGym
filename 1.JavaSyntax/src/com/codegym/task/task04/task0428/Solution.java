package com.codegym.task.task04.task0428;

/* 
Positive number

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int arr[] = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        int count = 0;

        for (int i : arr) {
            if (i > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
