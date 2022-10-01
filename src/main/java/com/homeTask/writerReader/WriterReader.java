package com.homeTask.writerReader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriterReader {

    public static void write(String someText) {
        try {
            Files.write(Paths.get("myfile.txt"), someText.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
            Files.write(Paths.get("myfile.txt"), "\n".getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile(String text) {
        try(OutputStream outputStream = new FileOutputStream("myfile.txt", true)) {
            outputStream.write(text.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        writeFile("dffff");
    }
}
