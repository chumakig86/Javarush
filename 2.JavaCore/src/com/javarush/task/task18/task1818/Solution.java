package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = reader.readLine();
        String s2 = reader.readLine();
        String s3 = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(s1);
        FileInputStream inputStream1 = new FileInputStream(s2);
        FileInputStream inputStream2 = new FileInputStream(s3);
        while   (inputStream1.available() > 0) {
            int a = inputStream1.read();
            outputStream.write(a);
        }
        while (inputStream2.available() > 0) {
            int b = inputStream2.read();
            outputStream.write(b);
        }
        outputStream.close();
        inputStream1.close();
        inputStream2.close();

    }
}
