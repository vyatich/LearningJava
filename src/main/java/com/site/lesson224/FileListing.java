package com.site.lesson224;

import java.io.File;

public class FileListing {

    public static void main(String[] args) {
        File file = new File("D:\\JProjects\\innopilis2023\\LearningJava\\src\\main\\java\\com\\site\\lesson224");
        File[] files = file.listFiles();

        for (File current : files) {
            if (!current.isDirectory()) {
                System.out.printf("File name %s with length %s \n", current.getName(), current.length());
            }
        }
    }
}
