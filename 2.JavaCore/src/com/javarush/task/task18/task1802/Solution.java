package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int min = Integer.MAX_VALUE;
        while (inputStream.available() > 0) {
            int compare = inputStream.read();
            if (compare < min) min = compare;
        }
        inputStream.close();
        System.out.println(min);
    }
}
