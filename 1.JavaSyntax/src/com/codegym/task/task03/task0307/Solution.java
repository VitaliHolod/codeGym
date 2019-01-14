package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        Zerg zerg1 = new Zerg();
        zerg1.name = "Amigo";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Sasha";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Diego";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Dima";
        Zerg zerg5 = new Zerg();
        zerg5.name = "Vasa";
        Protoss protoss1 = new Protoss();
        protoss1.name = "Lisa";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Misa";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Kaha";
        Terran teran1 = new Terran();
        teran1.name = "Zora";
        Terran teran2 = new Terran();
        teran2.name = "Zira";
        Terran teran3 = new Terran();
        teran3.name = "Nita";
        Terran teran4 = new Terran();
        teran4.name = "Yu";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
