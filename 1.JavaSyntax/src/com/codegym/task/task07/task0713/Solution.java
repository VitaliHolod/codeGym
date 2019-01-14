package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> main = new ArrayList<>();
        ArrayList<Integer> div3 = new ArrayList<>();
        ArrayList<Integer> div2 = new ArrayList<>();
        ArrayList<Integer> rest = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int a = 0; a < 20; a++) {

            main.add(input.nextInt());

            if (main.get(a) % 2 == 0)
                div2.add(main.get(a));

            if (main.get(a) % 3 == 0)
                div3.add(main.get(a));

            if (main.get(a) % 2 != 0 && main.get(a) % 3 != 0)
                rest.add(main.get(a));
        }
        printList(div3);
        printList(div2);
        printList(rest);
    }

    public static void printList(List<Integer> list) {

        for (int a = 0; a < list.size(); a++)
            System.out.println(list.get(a));
    }
}
