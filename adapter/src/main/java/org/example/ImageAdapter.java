package org.example;

class ImageAdapter implements Printer {
    private ImageDisplayer imageDisplayer;

    public ImageAdapter(ImageDisplayer imageDisplayer) {
        this.imageDisplayer = imageDisplayer;
    }

    @Override
    public void print(String imageName) {
        imageDisplayer.displayImage(imageName);
    }
}