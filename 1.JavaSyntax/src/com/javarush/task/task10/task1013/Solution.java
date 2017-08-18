package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private int weight;
        private String sex;
        private int height;
        private boolean marrige;

        public Human(String name, int age, int weight, String sex, int height, boolean marrige) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.height = height;
            this.marrige = marrige;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, String sex, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.height = height;
        }

        public Human(int age, int weight, String sex, int height, boolean marrige) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.height = height;
            this.marrige = marrige;
        }

        public Human(String name, int age, int weight, String sex, boolean marrige) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.marrige = marrige;
        }

        public Human(String name, String sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(String name, String sex, boolean marrige) {
            this.name = name;
            this.sex = sex;
            this.marrige = marrige;
        }

        public Human(int weight, String sex, int height) {
            this.weight = weight;
            this.sex = sex;
            this.height = height;
        }
    }
}
