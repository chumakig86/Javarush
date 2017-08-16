package com.javarush.task.task38.task3803;

/* 
Runtime исключения (unchecked exception)
*/

public class VeryComplexClass {
    public void methodThrowsClassCastException() {
        Object ch = new Character('*');
        System.out.println((Byte)ch);
    }

    public void methodThrowsNullPointerException() {
    int [] test = null;
    System.out.println(test.length);
    }

    public static void main(String[] args) {
        VeryComplexClass test = new VeryComplexClass();
        test.methodThrowsNullPointerException ();
    }
}
