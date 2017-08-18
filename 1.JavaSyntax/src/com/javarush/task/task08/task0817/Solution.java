package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap <String, String> map = new HashMap<>();
        map.put("Khromih", "Elena");
        map.put("Pupkin", "Elena");
        map.put("Lenkin", "Elena");
        map.put("Perkin", "Elena");
        map.put("Vlupin", "Elena");
        map.put("Huhin", "Elena");
        map.put("Puchkin", "Elena");
        map.put("Gopnik", "Elena");
        map.put("Pukach", "Elena");
        map.put("Golovach", "Elena");
        return map;

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        String [] names = new String[10];
        ArrayList arrayList = new ArrayList<>();
        int i = 0;
        for (Entry enry : map.entrySet()) {
            names[i] = (String) enry.getValue();
            i++;
        }
        for (int j = 0; j < names.length; j++) {
            for (int j2 = 1+j; j2 < names.length; j2++) {
                if (names[j].equals(names[j2])) {
                    arrayList.add(names[j2]);
                }
            }
        }
        for (int j = 0; j < arrayList.size(); j++)
            removeItemFromMapByValue(map, (String) arrayList.get(j));
    }



    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}
