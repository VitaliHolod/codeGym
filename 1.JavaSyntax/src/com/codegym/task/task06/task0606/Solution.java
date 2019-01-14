package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Scanner;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String arr[] = scanner.next().split("");

        for (int i = 0; i < arr.length; i++) {
            if (Integer.parseInt(arr[i]) % 2 == 0) {
                even++;
            } else odd++;
        }
        System.out.printf("Even: %d Odd: %d", even, odd);
    }
}
