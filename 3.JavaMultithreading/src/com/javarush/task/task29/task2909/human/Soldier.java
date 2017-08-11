package com.javarush.task.task29.task2909.human;

/**
 * Created by user on 09.07.2017.
 */
public class Soldier extends Human{


    public Soldier(String name, int age) {
        super(name, age);
    }



    public void fight() {
    }

    @Override
    public void live() {
        fight();
    }
}
