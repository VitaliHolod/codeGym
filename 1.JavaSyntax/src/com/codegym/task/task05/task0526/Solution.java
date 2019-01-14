package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("!1", 10, "a1");
        Man man2 = new Man("!22", 10, "a2");

        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);


        Woman woman1 = new Woman("!", 10, "a1");
        Woman woman2 = new Woman("!", 10, "33a");

        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);

    }

    //1. Inside the Solution class, create public static Man and Woman classes.
    //2. The classes must have the following fields: String name, int age, String address.
    //3. Make constructors that have all possible parameters.
    //4. Create two objects of each class with complete data using a constructor.
    //5. Display the objects on the screen in this format: name + " " + age + " " + address

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}
