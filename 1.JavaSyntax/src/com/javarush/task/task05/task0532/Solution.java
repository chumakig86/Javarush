package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int maximum = Integer.parseInt(reader.readLine());
        for (int j = 1; j < n; j++) {
            int i = Integer.parseInt(reader.readLine());
            if (i >= maximum) maximum = i;
        }
        System.out.println(maximum);
    }
}
