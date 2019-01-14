package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());

        for (int i = 0; t >= 5; i++) {
            t = t - 5;
        }

        if (t >= 0 && t < 3) System.out.println("green");
        else if (t >= 3 && t < 4) System.out.println("yellow");
        else System.out.println("red");
    }
}