package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String name = scanner.next();

        System.out.printf("%s will take over the world in %d years. Mwa-ha-ha!", name, number);

    }
}
