package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String digit1 = reader.readLine();
        String digit2 = reader.readLine();
        int ndigit1 = Integer.parseInt(digit1);
        int ndigit2 = Integer.parseInt(digit2);
        System.out.println(name + " получает " + ndigit1 + " через " + ndigit2 + " лет.");
    }
}
