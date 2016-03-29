package com.company;

import java.io.*;
import java.util.ArrayList;

public class _6_SaveACustomObjectInAFile {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        Course java = new Course("Java", 200);

        ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/course.save")));

        oos.writeObject(java);
        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(
                new BufferedInputStream(
                        new FileInputStream("resources/course.save")));
        Course reader = (Course)ois.readObject();
        reader.print();
        ois.close();
    }
}


