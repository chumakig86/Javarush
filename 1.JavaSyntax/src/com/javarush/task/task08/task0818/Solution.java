package com.javarush.task.task08.task0818;


import java.util.HashMap;
import java.util.Map;
import java.util.*;
import java.util.Iterator;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap map = new HashMap<>();
        for(int i = 0; i<10; i++){
            map.put("Фамилия"+i, 300+(i*40));
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry pair = (Map.Entry) iterator.next();
            if ((int) pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}