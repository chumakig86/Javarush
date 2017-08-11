package com.javarush.task.task13.task1309;

/* 
Наследование интерфейса
*/

public class Solution {
    interface Movable {
        Double speed ();
    }
    interface Flyable extends Movable {
        Double speed (Flyable a);
    }
    public static void main(String[] args) throws Exception {
    }
}