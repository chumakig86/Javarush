package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int in = 0;
        int sum = 0;

        while (true) {
            input = reader.readLine();
            if (input.equals("сумма")) break;
            in = Integer.parseInt(input);
            sum += in;
        }
        System.out.println(sum);
    }
}
