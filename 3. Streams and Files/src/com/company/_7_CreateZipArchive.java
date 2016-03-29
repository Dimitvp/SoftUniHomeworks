package com.company;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class _7_CreateZipArchive {
    public static void main(String[] args) throws IOException {
        File [] files = new File [3] ;
        files[0] = new File("resources/words.txt");
        files[1] = new File("resources/count-chars.txt");
        files[2] = new File("resources/lines.txt");
        File fileZip = new File ("resources/text-files.zip");

        byte [] buffer = new byte [1024];
        File file = null;


        ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream(fileZip));


        for (int i=0 ; i < files.length ; i++) {
            file = files[i];

//            BufferedInputStream  bis = new BufferedInputStream( new FileInputStream(file));
//
//            zos.putNextEntry(new ZipEntry(file.getName()));
//            int length;
//            while ((length = bis.read(buffer)) != -1) {
//                zos.write(buffer, 0, length);
//            }

            zos.putNextEntry(new ZipEntry(file.getName()));
            zos.closeEntry();
        }
        zos.finish();
        zos.close();
    }
}
