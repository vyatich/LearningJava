package com.site.part2.lesson224;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputToByte {

    public static void main(String[] args) throws IOException {
        String inputFilePath = "D:\\JProjects\\innopilis2023\\LearningJava\\src\\main\\java\\com\\site\\lesson224\\input.txt";
        File file = new File("D:\\JProjects\\innopilis2023\\LearningJava\\src\\main\\java\\com\\site\\lesson224\\files");
        if (!file.exists()) {
            file.mkdirs();
        }
        String pathFile = "D:\\JProjects\\innopilis2023\\LearningJava\\src\\main\\java\\com\\site\\lesson224\\files\\output.txt";
        FileInputStream fileInputStream = new FileInputStream(inputFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
        int read = fileInputStream.read();
        while (read >=0) {
            char currentChar = (char) read;
            if (currentChar != '.' && currentChar != ',') {
                fileOutputStream.write(read);
            }
            read = fileInputStream.read();
        }
    }
}
