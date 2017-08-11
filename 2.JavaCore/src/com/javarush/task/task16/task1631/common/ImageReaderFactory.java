package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

/**
 * Created by test25 on 08.02.2017.
 */
public class ImageReaderFactory {

    public static ImageReader getImageReader(ImageTypes imageTypes)
    {
        if (imageTypes == ImageTypes.JPG) return new JpgReader();
        if (imageTypes == ImageTypes.BMP) return new BmpReader();
        if (imageTypes == ImageTypes.PNG) return new PngReader();
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }

}
