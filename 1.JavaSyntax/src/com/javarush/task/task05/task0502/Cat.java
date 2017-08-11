package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        if (strength > anotherCat.strength) {
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Вася";
        cat.age = 5;
        cat.weight =18;
        cat.strength = 20;

        Cat cat1 = new Cat();
        cat1.name = "Димон";
        cat1.age = 7;
        cat1.weight =17;
        cat1.strength = 21;

        System.out.println(cat.fight(cat1));
    }
}
