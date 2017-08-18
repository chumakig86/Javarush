package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
        String s = rs.readLine();
        return s;

    }

    public static int readInt() throws Exception {
        BufferedReader ri = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(ri.readLine());
        return i;

    }

    public static double readDouble() throws Exception {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(rd.readLine());
        return d;

    }

    public static boolean readBoolean() throws Exception {
        return Boolean.parseBoolean(ConsoleReader.readString());

    }

    public static void main(String[] args) {

    }
}
