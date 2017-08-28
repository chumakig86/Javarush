package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(Integer.parseInt(reader.readLine()));
        }
        System.out.println(maxSeries(list));
    }

    public static int maxSeries(List list) {
        int x = 1;
        int y = 1;
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                x++;
                if (y < x) y = x;
            } else x = 1;
        }
        return y;

    }
}