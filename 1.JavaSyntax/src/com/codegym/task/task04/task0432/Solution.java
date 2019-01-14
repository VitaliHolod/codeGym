package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = scanner.nextInt();

        int count = 0;

        while (count < n) {
            System.out.println(s);
            count++;
        }

    }
}
