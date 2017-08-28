package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle(double x, double y, double radius)
    {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x, double y)
    {
        this.y = y;
        this.radius = 10;
        this.x=x;
    }
    public Circle(double radius)
    {
        this.radius = radius;
        this.x=10;
        this.y=10;
    }
    public Circle()
    {
        ///this.radius = radius;
        //this.x=10;
        //this.y=10;
        this(10,10,10);
    }


    public static void main(String[] args) {

    }
}