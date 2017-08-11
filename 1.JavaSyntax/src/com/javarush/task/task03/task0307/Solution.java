package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        Zerg ZergName[] = new Zerg[10];
        for (int i = 0; i < 10; i++){
            ZergName[i] = new Zerg();
            ZergName[i].name = "zerg" + (i + 1);
            System.out.println(ZergName[i].name);
        }
        Protoss ProtossName[] = new Protoss[5];
        for (int i = 0; i < 5; i++){
            ProtossName[i] = new Protoss();
            ProtossName[i].name = "protoss" + (i + 1);
            System.out.println(ProtossName[i].name);
        }
        Terran TerranName[] = new Terran[12];
        for (int i = 0; i < 12; i++){
            TerranName[i] = new Terran();
            TerranName[i].name = "terran" + (i + 1);
            System.out.println(TerranName[i].name);
        }
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
