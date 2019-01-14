package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = Integer.parseInt(s);

        if (n <= 999 && n >= 1) {
            if (s.length() == 1) {
                if (n % 2 == 0) {
                    System.out.println("even single-digit number");
                } else System.out.println("odd single-digit number");
            }
            if (s.length() == 2) {
                if (n % 2 == 0) {
                    System.out.println("even two-digit number");
                } else System.out.println("odd two-digit number");
            }
            if (s.length() == 3) {
                if (n % 2 == 0) {
                    System.out.println("even three-digit number");
                } else System.out.println("odd three-digit number");
            }
        }


    }
}
