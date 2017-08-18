package com.javarush.task.task14.task1421;

/**
 * Created by user on 13.05.2017.
 */
public class Singleton {
    private Singleton(){}
    private static final Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
