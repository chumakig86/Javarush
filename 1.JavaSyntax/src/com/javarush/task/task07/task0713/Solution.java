package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> d = new ArrayList<>();
        for (int i = 0; i < 20; i++) a.add(Integer.parseInt(reader.readLine()));
        for (int i = 0; i < 20; i++) {
            if ((a.get(i)%3==0)) {
                if ((a.get(i)%2==0)) {
                    b.add(a.get(i));
                    c.add(a.get(i));
                }
                else b.add(a.get(i));
            }
            else if ((a.get(i)%2==0)) c.add(a.get(i));
            else d.add(a.get(i));
        }
        printList(b);
        printList(c);
        printList(d);
    }

    public static void printList(List<Integer> list) {

        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
    }
}
