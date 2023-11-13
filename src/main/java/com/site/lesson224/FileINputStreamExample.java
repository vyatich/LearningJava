package com.site.lesson224;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileINputStreamExample {

    public static void main(String[] args) throws IOException {
        String path = "D:\\JProjects\\innopilis2023\\LearningJava\\src\\main\\java\\com\\site\\lesson224\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        int read = fileInputStream.read();
        while (read >= 0) {
            System.out.println(read);
            read = fileInputStream.read();
        }
    }
}
