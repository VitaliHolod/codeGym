package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.printf("%s will receive %d in %d years.", name, number1, number2);

    }
}
