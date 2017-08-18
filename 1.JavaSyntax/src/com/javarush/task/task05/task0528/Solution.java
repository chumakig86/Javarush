package com.javarush.task.task05.task0528;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Date;
/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat format1 = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format1.format(d));
    }
}
