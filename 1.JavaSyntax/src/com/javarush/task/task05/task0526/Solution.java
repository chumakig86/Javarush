package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Vasya", 45, "Moskov");
        Man man2 = new Man("Kolya", 40, "Dnepr");
        Woman woman1 = new Woman("Tanya", 25, "Sumy");
        Woman woman2 = new Woman("Sonya", 20, "Orel");
        System.out.println(man1.name + " " + man1.age + " " + man1.address);
        System.out.println(man2.name + " " + man2.age + " " + man2.address);
        System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
        System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String n, int a, String ad) {
            name = n;
            age = a;
            address = ad;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String n, int a, String ad) {
            name = n;
            age = a;
            address = ad;
        }
    }
}
