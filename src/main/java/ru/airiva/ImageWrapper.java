package ru.airiva;

import gk.tbi.TbiBlob;

import java.io.InputStream;

/**
 * @author Ivan
 */
public class ImageWrapper implements TbiBlob {

    private InputStream image;

    ImageWrapper(String path) {
        image = this.getClass().getClassLoader().getResourceAsStream(path);
    }

    @Override
    public InputStream getInputStream() {
        return image;
    }

    @Override
    public int getLength() {
        return 0;
    }
}
