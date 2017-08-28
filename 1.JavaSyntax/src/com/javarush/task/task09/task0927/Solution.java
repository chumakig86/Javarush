package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> map = new HashMap<>();
        map.put("Vaska", new Cat("Vaska"));
        map.put("Tishka", new Cat("Tishka"));
        map.put("Putik", new Cat("Putik"));
        map.put("Flashka", new Cat("Flashka"));
        map.put("Anton", new Cat("Anton"));
        map.put("Zuzik", new Cat("Zuzik"));
        map.put("Pushok", new Cat("Pushok"));
        map.put("Sonka", new Cat("Sonka"));
        map.put("Shunka", new Cat("Shunka"));
        map.put("Mashutka", new Cat("Mashutka"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> cats = new HashSet<>();
        for (Map.Entry pair : map.entrySet()) {
        cats.add((Cat) pair.getValue());
        }
        return cats;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
