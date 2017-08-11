package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList <String> list = new ArrayList();
        for(int i = 0; i < 5; i++)
        {
            list.add(reader.readLine());
        }
        String s = (String) list.get(0);
        int max = ((String) list.get(0)).length();
        for(int i = 0; i < list.size(); i++)
        {
            if(((String) list.get(i)).length() > max)
            {
                max = ((String) list.get(i)).length();
                s = (String) list.get(i);
            }
        }
        System.out.println(s);
        for(int i = 0; i < list.size(); i++)
        {
            if(!((String) list.get(i)).equals(s) && ((String) list.get(i)).length() == max )
            {
                System.out.println(list.get(i));
            }
        }
    }
}
