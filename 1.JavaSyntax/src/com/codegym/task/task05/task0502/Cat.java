package com.codegym.task.task05.task0502;

/* 
Implement the fight method

*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        boolean flag = false;
        if ((weight + strength + age) < (anotherCat.age + anotherCat.weight + anotherCat.strength)) {
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
    }
}
