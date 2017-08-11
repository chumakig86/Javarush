package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * Created by chumak on 21.07.17.
 */
public class ConsoleHelper {

    public static void writeMessage(String message) {System.out.println(message);}
    public static String readString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
    }
    public static int readInt() throws IOException {
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        return i;
    }
}
