package com.codegym.task.task05.task0507;

/* 
Arithmetic mean

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double res = 0;

        while (true) {
            count++;
            int num = scanner.nextInt();

            if (num == -1) {
                System.out.println(res);
                break;
            } else {
                sum += num;
                res = sum / count;
            }
        }
    }
}


