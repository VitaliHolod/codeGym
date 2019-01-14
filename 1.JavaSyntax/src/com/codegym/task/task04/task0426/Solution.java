package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Zero");
        } else {
            if (n % 2 != 0) {
                if (n > 0) {
                    System.out.println("Positive odd number");//Положительное нечетное число
                } else {
                    System.out.println("Negative odd number");
                }
            }

            if (n % 2 == 0) {
                if (n > 0) {
                    System.out.println("Positive even number");//Положительное четное число
                } else {
                    System.out.println("Negative even number");
                }
            }
        }
    }
}
