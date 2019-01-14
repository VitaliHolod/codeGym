package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(10, 5));
        System.out.println(convertEurToUsd(1, 7));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
    }
}
