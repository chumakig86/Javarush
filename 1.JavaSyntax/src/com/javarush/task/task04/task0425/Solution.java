package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int quarter;
        if (a>0 && b>0) quarter = 1;
        else if (a<0 && b>0) quarter = 2;
        else if (a<0 && b<0) quarter = 3;
        else  quarter = 4;
        System.out.println(quarter);
    }
}
