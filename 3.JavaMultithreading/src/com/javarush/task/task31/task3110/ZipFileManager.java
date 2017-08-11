package com.javarush.task.task31.task3110;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by chumak on 21.07.17.
 */
public class ZipFileManager {
    private Path zipFile;

    public ZipFileManager(Path zipFile) {
        this.zipFile = zipFile;
    }
    public void createZip(Path source) throws Exception {
        // Проверяем, существует ли директория, где будет создаваться архив
        // При необходимости создаем ее
        Path zipDirectory = zipFile.getParent();
        if (Files.notExists(zipDirectory))
            Files.createDirectories(zipDirectory);


        try (ZipOutputStream zipOutputStream = new ZipOutputStream(Files.newOutputStream(zipFile));) {
            ZipEntry zipEntry = new ZipEntry(source.getFileName().toString());
            zipOutputStream.putNextEntry(zipEntry);
            try (InputStream inputStream = Files.newInputStream(source);){
                byte[] readBuffer = new byte[2048];
                int amountRead;
                int written = 0;

                while ((amountRead = inputStream.read(readBuffer)) > 0) {
                    zipOutputStream.write(readBuffer, 0, amountRead);
                    written += amountRead;
                }
        }

        }






            }
        }


