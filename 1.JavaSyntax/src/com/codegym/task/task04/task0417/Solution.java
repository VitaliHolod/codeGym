package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a == b && a == c) {
            System.out.println(a + " " + a + " " + a);
        } else {
            if (a == b) {
                System.out.println(a + " " + b);
            } else if (a == c) System.out.println(a + " " + c);

            if (c == b) {
                System.out.println(c + " " + b);
            }
        }
    }
}