package org.example;

public class Main {
    public static void main(String[] args) {
        TextPrinter textPrinter = new TextPrinter();
        ImageDisplayer imageDisplayer = new ImageDisplayer();
        Printer adapter = new ImageAdapter(imageDisplayer);

        textPrinter.printText("Hello, world!");
        adapter.print("nature.jpg");
    }
}