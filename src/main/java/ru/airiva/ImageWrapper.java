package ru.airiva;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author Ivan
 */
public class ImageWrapper {

    private InputStream image;

    public ImageWrapper(String path) {
        try {
            image = new FileInputStream(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public InputStream getImage() {
        return image;
    }
}
