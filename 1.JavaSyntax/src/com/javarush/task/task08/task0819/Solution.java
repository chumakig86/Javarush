package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        Iterator iterator = cats.iterator();
        cats.remove(iterator.next());

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set hsc = new HashSet();
        hsc.add(new Cat());
        hsc.add(new Cat());
        hsc.add(new Cat());
        return hsc;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat cat : cats) {
            System.out.println(cat);
        }
    }

    public static class Cat{}
}
