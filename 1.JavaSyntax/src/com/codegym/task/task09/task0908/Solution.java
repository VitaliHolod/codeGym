package com.codegym.task.task09.task0908;

/* 
Exception while working with strings

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        try {
            String s = null;
            String m = s.toLowerCase();

        } catch (NullPointerException n) {
            System.out.println(n.toString());
        }
    }
}
