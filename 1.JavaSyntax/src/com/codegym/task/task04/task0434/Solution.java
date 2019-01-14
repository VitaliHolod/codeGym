package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        int i = 1;

        while (i <= 10) {

            int k = 1;
            while (k <= 10) {
                System.out.print(i * k + " ");
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
