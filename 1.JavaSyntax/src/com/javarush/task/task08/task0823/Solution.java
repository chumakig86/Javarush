package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] letter = s.toCharArray();



        for (int i = 0; i < letter.length;) {
            if (letter[i]==letter[0])  letter[i] = Character.toUpperCase(letter[i]);

            if (!Character.isLetter(letter[i])) {
                letter[i+1] = Character.toUpperCase(letter[i+1]);
                i++;
            }
            else i++;
        }
        System.out.print(letter);
    }
}
