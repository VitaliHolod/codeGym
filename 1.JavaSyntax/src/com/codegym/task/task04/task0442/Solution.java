package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                System.out.println(res-1);
                break;
            } else {
                res += number;
            }
        }
    }
}
