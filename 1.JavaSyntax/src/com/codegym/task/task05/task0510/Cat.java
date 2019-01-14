package com.codegym.task.task05.task0510;

/* 
Initializing cats

*/

public class Cat {

    String name = null;
    int age = 1;
    int weight = 12;
    String address = null;
    String color = "brown";


    public void initialize(String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.color = color;

    }

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}