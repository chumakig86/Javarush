package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        String s = String.valueOf(number);
        int sum = 0;
        for(int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            sum += Integer.parseInt(ch.toString());
        }
        return sum;
    }
}