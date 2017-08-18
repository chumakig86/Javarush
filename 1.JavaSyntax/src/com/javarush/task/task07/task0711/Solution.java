package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            list.add(i, reader.readLine());
        }
        String tstr;
        for (int i = 0; i < 13; i++) {
            tstr = list.get(4);
            list.remove(4);
            list.add(0, tstr);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    }
}
