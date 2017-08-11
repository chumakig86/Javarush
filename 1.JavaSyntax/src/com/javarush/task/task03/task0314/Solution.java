package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution  {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[][] n1=new int[11][11];
        for(int i=1;i < n1.length;i++){
            for(int j=1;j < n1.length;j++)
                n1[i][j]=j*i;
        }
        for(int i=1;i < n1.length;i++){
            for(int j=1;j < n1.length;j++){
                System.out.print(n1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
