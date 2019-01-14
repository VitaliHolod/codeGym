package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            System.out.println(n * 2);
        }
        if (n < 0) {
            System.out.println(n + 1);
        }
        if (n == 0) {
            System.out.println(n);
        }

    }

}