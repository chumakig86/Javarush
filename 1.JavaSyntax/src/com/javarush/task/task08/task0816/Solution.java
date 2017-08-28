package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Shwarz", new Date("MAY 5 1980"));
        map.put("Norris", new Date("DECEMBER 16 1980"));
        map.put("Dokaskos", new Date("AUGUST 8 1980"));
        map.put("VanDamm", new Date("APRIL 24 1980"));
        map.put("Lundgren", new Date("JANUARY 14 1980"));
        map.put("Lee", new Date("JULY 22 1980"));
        map.put("Chan", new Date("JUNE 5 1980"));
        map.put("Willis", new Date("MARCH 6 1980"));
        map.put("Snipes", new Date("SEPTEMBER 15 1980"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()){
            HashMap.Entry pair = (HashMap.Entry) it.next();
            Date d = (Date) pair.getValue();
            if ((d.getMonth() > 4) && (d.getMonth() < 8))
                it.remove();
        }

    }

    public static void main(String[] args) {

    }
}
