package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

import java.text.SimpleDateFormat;
import java.util.Date;

//"06 15 2018"

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");
        System.out.println(simpleDateFormat.format(date));
    }
}
