package com.codegym.task.task04.task0424;

/* 
Three numbers

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};


        if (arr[0] == arr[1]) {
            System.out.println("3");
        }
        if (arr[1] == arr[2]) {
            System.out.println("1");
        }
        if (arr[0] == arr[2]) {
            System.out.println("2");
        }
    }
}

