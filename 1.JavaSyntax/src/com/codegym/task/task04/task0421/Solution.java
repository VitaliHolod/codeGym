package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        int len1 = name1.length();
        int len2 = name2.length();

        if (name1.equals(name2)) {
            System.out.println("The names are identical");
        }else
        if (len1 == len2) {
            System.out.println("The names are the same length");
        }
    }
}

