package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _4_CopyJpgFile {
    public static void main(String[] args) throws IOException{
        FileInputStream fis = new FileInputStream(
                new File("resources/TheVenusProject.jpg"));
        FileOutputStream fos = new FileOutputStream(
                new File("resources/mu-copied-picture.jpg"));

        byte[] buffer = new byte[4096];
        int bytes = 0;
        while(!((bytes = fis.read(buffer, 0, buffer.length))<=0)){
            fos.write(buffer, 0, bytes);
        }

        fis.read(buffer);
        fos.write(buffer);
    }
}
