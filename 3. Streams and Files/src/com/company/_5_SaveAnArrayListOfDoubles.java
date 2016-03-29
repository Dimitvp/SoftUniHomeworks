package com.company;

import java.io.*;
import java.util.ArrayList;

public class _5_SaveAnArrayListOfDoubles {
    public static void main(String[] args) throws IOException, ClassNotFoundException{
        ObjectOutputStream oos = new ObjectOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream("resources/doubles.list")));

        ArrayList<Double> someDobules = new ArrayList<>();
        someDobules.add(3.14);
        someDobules.add(9.4);
        someDobules.add(12.530);
        oos.writeObject(someDobules);

        oos.flush();

        ObjectInputStream ois = new ObjectInputStream(
                                new BufferedInputStream(
                                        new FileInputStream("resources/doubles.list")));
        System.out.println(ois.readObject());

        ois.close();

    }
}
