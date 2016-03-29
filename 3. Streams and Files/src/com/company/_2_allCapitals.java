package com.company;

import java.io.*;

public class _2_AllCapitals {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(
                                new FileReader(
                                        "resources/lines.txt"
                                ));
        String fullText = "";
        String tempStr;

        while ((tempStr = reader.readLine()) != null) {
            fullText += tempStr.toUpperCase() + "\r\n";
        }

        PrintWriter writer = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(
                                "resources/lines.txt")));
        writer.write(fullText);
        writer.flush();
        reader.close();
        writer.close();
    }
}
