package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Checking the order

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int check = 0, ans = -1;

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextLine());


            if (check < list.get(i).length())
                check = list.get(i).length();

            else {
                if (ans == -1)
                    ans = i;
            }
        }
        if (ans != -1)
            System.out.println(ans);
    }
}


