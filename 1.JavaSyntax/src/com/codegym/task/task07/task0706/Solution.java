package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/* 
Streets and houses

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[15];
        List<Integer> arrOdd = new ArrayList<>();
        List<Integer> arrEven = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input.readLine());
        }

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arrEven.add(arr[i]);
            }
            if (i % 2 != 0) {
                arrOdd.add(arr[i]);
            }
        }

        int countEven = 0;
        int countOdd = 0;

        for (int i = 0; i <= arrEven.size() - 1; i++) {
            countEven += arrEven.get(i);
        }
        for (int i = 0; i < arrEven.size() - 1; i++) {
            countOdd += arrOdd.get(i);
        }

        System.out.println(countEven < countOdd ?
                "Odd-numbered houses have more residents." :
                "Even-numbered houses have more residents.");
    }
}
