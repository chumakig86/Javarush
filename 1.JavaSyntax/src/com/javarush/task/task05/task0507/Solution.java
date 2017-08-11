package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        float i =0;
        float sum = 1;
        int counter = -1;
        while (i != -1){
            i = Float.parseFloat(reader.readLine());
            sum = sum + i;
            counter++;
        }

        float result = (sum / (counter));
        System.out.println(result);
    }
}

