package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;

/**
 * Created by chumak on 21.07.17.
 */
public class Archiver {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter full path to archive:");
        String path = reader.readLine();
        ZipFileManager zfm = new ZipFileManager(Paths.get(path));
        System.out.println("Select file to archive:");
        String pathToZip = reader.readLine();
        zfm.createZip(Paths.get(pathToZip));
        reader.close();
    }
}
