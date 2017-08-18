package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 40; i++) {
            builder.append(s.substring(i, s.length()));
            builder.append("\n");
        }
        System.out.println(builder.toString());
    }

}

