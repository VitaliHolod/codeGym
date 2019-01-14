package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
