package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String date = reader.readLine();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        Date y = s.parse(date);
        SimpleDateFormat a = new SimpleDateFormat("MMM d, yyyy", Locale.ENGLISH);

        System.out.println(a.format(y).toUpperCase());
    }
}
