package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String s = bufferedReader.readLine();
        int a = Integer.parseInt(s);
        int x = 365;

        if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
            System.out.println("количество дней в году: " + (x+1));
        else
            System.out.println("количество дней в году: " + x);
    }
}