package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 2 2020"));
    }

    public static boolean isDateOdd(String date) {
        Date date1 = new Date(date);
        Date date2 = new Date();
        date2.setMonth(0);
        date2.setDate(0);
        date2.setYear(date1.getYear());
        date2.setSeconds(0);
        date2.setMinutes(0);
        date2.setHours(0);

        long countDay = date1.getTime() - date2.getTime();
        int countDay2 = (int) (countDay / (3600 * 24 * 1000));



        return countDay2%2==0;
    }
}
