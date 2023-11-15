package com.site.part2.lesson224.serlialization;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Cube cube = new Cube(new Side(), 23, 44,55);
        String path = "D:\\JProjects\\innopilis2023\\LearningJava\\src\\main\\java\\com\\site\\lesson224\\serlialization\\out.txt";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(path));
        objectOutputStream.writeObject(cube);

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(path));
        Cube outputCube = (Cube) objectInputStream.readObject();
        System.out.println(outputCube);
    }
}
