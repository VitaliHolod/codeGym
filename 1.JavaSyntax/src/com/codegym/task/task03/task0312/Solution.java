package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }
}
