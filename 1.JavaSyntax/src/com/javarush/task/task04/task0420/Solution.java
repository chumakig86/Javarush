package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        int num[] = new int[3];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num[0] = Integer.parseInt(br.readLine());
        num[1] = Integer.parseInt(br.readLine());
        num[2] = Integer.parseInt(br.readLine());
        Arrays.sort(num);
        System.out.println(num[2] + " " + num[1] + " " + num [0]);
    }
}
