package com.codegym.task.task04.task0443;


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int yyyy = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();

        System.out.printf("My name is %s.\n", name);
        System.out.printf("I was born on %d/%d/%d\n", mm, dd, yyyy);
    }
}
