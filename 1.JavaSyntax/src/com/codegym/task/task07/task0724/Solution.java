package com.codegym.task.task07.task0724;

/* 
Family census
*/

public class Solution {
    public static void main(String[] args) {
        Human gf1, gf2, gm1, gm2, f, m, d1, d2, s1;

        gf1 = new Human("mothers gf", true, 89);
        gf2 = new Human("fathers gf", true, 80);
        gm1 = new Human("mothers gm", false, 89);
        gm2 = new Human("fathers gm", false, 89);

        f = new Human("father", true, 50, gf2, gm2);
        m = new Human("mother", false, 55, gf1, gf2);

        d1 = new Human("anna", false, 25, f, m);
        d2 = new Human("bella", false, 25, f, m);
        s1 = new Human("fondu", true, 22, f, m);

        System.out.println(gf1.toString());
        System.out.println(gf2.toString());
        System.out.println(gm1.toString());
        System.out.println(gm2.toString());
        System.out.println(f.toString());
        System.out.println(m.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());
        System.out.println(s1.toString());

    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father, mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {

            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;

        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}