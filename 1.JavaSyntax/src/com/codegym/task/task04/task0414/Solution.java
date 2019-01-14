package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number of days in the year: ");
        int year = scanner.nextInt();

        if ((year % 400 != 0) && (year % 100 == 0) || year % 4 != 0) {
            System.out.println("Number of days in the year: 365");
        } else System.out.println("Number of days in the year: 366");
    }
}