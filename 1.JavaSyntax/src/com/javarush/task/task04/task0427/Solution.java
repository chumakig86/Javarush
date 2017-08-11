package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int a = Integer.parseInt(s);
        if (a >= 1 && a <= 999 ){
            if ((a%2)==0 && (s.length())==1) System.out.println("четное однозначное число");
            else if ((a%1)==0 && (s.length())==1) System.out.println("нечетное однозначное число");
            else if ((a%2)==0 && (s.length())==2) System.out.println("четное двузначное число");
            else if ((a%1)==0 && (s.length())==2) System.out.println("нечетное двузначное число");
            else if ((a%2)==0 && (s.length())==3) System.out.println("четное трехзначное число");
            else if ((a%1)==0 && (s.length())==3) System.out.println("нечетное трехзначное число");
        }

    }
}
