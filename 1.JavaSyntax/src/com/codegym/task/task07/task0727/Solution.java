
package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> modifiedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);

            if (s.length() % 2 == 0)
                modifiedList.add(s + " " + s);

            else
                modifiedList.add(s + " " + s + " " + s);
        }
        modifiedList.forEach(System.out::println);
    }
}