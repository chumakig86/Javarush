package com.javarush.task.task30.task3012;

/* 
Получи заданное число
*/

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.createExpression(2000);
    }

    public void createExpression(int number) {
        
        int [] pool = {1, 3, 9, 27, 81, 243, 729, 2187};
        String s = number + " = ";
        int i =0;
        while ((double) number/3 != 1.0 && i < 7) {

            if (number%3 == 0)
            {
            i++;
                number=number/3;
            continue;
            }
            else if (number%3 == 1)
            {

                s+= " + " + pool[i];
                i++;
                number=number/3;
            continue;
            }
            else if (number%3 == 2) {

                s += " - " + pool[i];

                number++;

                continue;
            }
        }
        if (i < 7) s+=" + " + pool[i+1];
        else s+=" + " + pool[i];

        System.out.println(s);

    }
}