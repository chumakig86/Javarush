package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] a = new int [20];
        int [] b = new int [10];
        int [] c = new int [10];
        for (int i = 0; i < 20; i++) a[i] = Integer.parseInt(reader.readLine());
        for (int j = 0; j < 20; j++) {
            if (j <10) b[j] = a[j];
            else c[j-10] = a[j];
        }
        for (int m = 0; m < 10; m++) System.out.println(c[m]);
    }
}
