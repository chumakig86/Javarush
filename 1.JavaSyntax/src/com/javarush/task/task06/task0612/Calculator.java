package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int minus(int a, int b) {
        int min = a - b;
        return min;
    }

    public static int multiply(int a, int b) {
        int mult = a*b;
        return mult;
    }

    public static double division(int a, int b) {
        double del = (double)a/(double)b;
        return del;
    }

    public static double percent(int a, int b) {
        double prc = (double)a/100D;
        return prc * b;
    }

    public static void main(String[] args) {
Calculator calc = new Calculator();
System.out.println(percent(6, 25));
    }
}