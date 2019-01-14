package com.codegym.task.task05.task0517;

/* 
Creating cats

*/

public class Cat {

//    - Name,
//- Name, weight, age
//- Name, age (standard weight)
//- Weight, color (name, address, and age are unknown; the cat is homeless)
//- Weight, color, address (someone else's pet)
    String name = null;
    int age = 1;
    int weight = 12;
    String address = null;
    String color = "brown";


    public Cat(String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Cat (int weight, String color) {
        this.weight = weight;
        this.color = color;

    }

    public Cat (int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
