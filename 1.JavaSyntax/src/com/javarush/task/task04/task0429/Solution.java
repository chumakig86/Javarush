package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = 0;
        int a = 0;
        for (int i = 0; i <= 2; i++){
            int c = Integer.parseInt(reader.readLine());
            if (c > 0) b++;
            else if (c < 0) a++;
        }
        System.out.println("количество отрицательных чисел: " + a);
        System.out.println("количество положительных чисел: " + b);
        }
}
