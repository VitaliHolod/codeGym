package com.codegym.task.task04.task0441;


/* 
Somehow average

*/

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[]{scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(numbers);
        System.out.println(numbers[1]);
    }
}

