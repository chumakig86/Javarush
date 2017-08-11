package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int arr [] = new int[4];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        arr[0] = Integer.parseInt(br.readLine());
        arr[1] = Integer.parseInt(br.readLine());
        arr[2] = Integer.parseInt(br.readLine());
        arr[3] = Integer.parseInt(br.readLine());
        int a = Math.max(arr[0], arr[1]);
        int b = Math.max(arr[2], arr[3]);
        int max = Math.max(a, b);
        System.out.println(max);

    }
}
