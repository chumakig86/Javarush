package com.javarush.task.task15.task1529;

/**
 * Created by user on 14.05.2017.
 */
public class Plane implements Flyable {
    private int passengers;
    @Override
    public void fly() {

    }

    public Plane(int passengers) {
        this.passengers = passengers;
    }
}
