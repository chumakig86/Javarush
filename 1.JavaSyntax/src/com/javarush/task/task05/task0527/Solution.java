package com.javarush.task.task05.task0527;

/* 
Том и Джерри
*/



public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);

        Cat tomCat = new Cat("Tom", 24, 20);
        Dog spykeDog = new Dog("Spyke", 24, 40);
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
public static class Cat {
        String name;
        int height, weight;
    public Cat(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
public static class Dog {
    String name;
    int height, weight;
    public Dog(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}
}
