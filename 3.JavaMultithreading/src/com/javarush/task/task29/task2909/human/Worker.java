package com.javarush.task.task29.task2909.human;

public class Worker implements Alive {
    private Human human;
    private double salary;
    public String company;

    public Worker(String name, int age) {
        human = new Human(name, age);
    }



    public double getSalary() {
        return salary;
    }

    public void setSlr(double salary) {
        this.salary = salary;
    }

    @Override
    public void live() {

    }
}