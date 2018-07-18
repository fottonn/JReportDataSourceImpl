package ru.airiva;

import gk.tbi.TbiBlob;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Ivan
 */
public class ImageWrapper implements TbiBlob {

    private InputStream image;

    public ImageWrapper(String path) {
        try {
            image = new FileInputStream(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return image;
    }

    @Override
    public int getLength() throws IOException {
        return 0;
    }
}
