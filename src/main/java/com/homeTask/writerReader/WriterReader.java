package com.homeTask.writerReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriterReader {

    public static List<String> readAllFromFile() {
        List<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("F:\\Java education\\Java IT VDN\\Home task\\Spring Home\\Spring-MVC-homeLess4\\myfile.txt"));
            while (scanner.hasNext()) {
            String string = scanner.nextLine();
            list.add(string);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    public static void writer(String text) {
        try (OutputStream outputStream = new FileOutputStream("F:\\Java education\\Java IT VDN\\Home task\\Spring Home\\Spring-MVC-homeLess4\\myfile.txt", true)) {
            outputStream.write((text + "\n").getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        List<String> list = readAllFromFile();

    }
}
