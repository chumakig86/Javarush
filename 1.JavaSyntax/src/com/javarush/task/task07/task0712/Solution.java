package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList <String> list = new ArrayList <String> ();
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(r.readLine());
        }
        int longest = 0;
        int shortest = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() > list.get(longest).length()) {
                longest = i;
            }
            if (list.get(i).length() < list.get(shortest).length()) {
                shortest = i;
            }
        }
        if (longest < shortest) {
            System.out.print(list.get(longest));
        }
        else System.out.print(list.get(shortest));
    }
}
