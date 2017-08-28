package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        double m=t%5;
        if(m<3){
            System.out.println("зелёный");
        } else if(m>=3 && m<4){
            System.out.println("желтый");
        } else {System.out.println("красный");
        }
    }
}