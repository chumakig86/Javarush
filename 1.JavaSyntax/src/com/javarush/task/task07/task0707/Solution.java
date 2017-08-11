package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");

        int n = list.size();
        System.out.println(n);
        for (int i = 0; i < n; i++)
        {
            System.out.println( list.get(i) );
        }
    }
}
