package com.company;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class _3_CountCharacterTypes {
    public static void main(String[] args) throws IOException{
        String vowels = "aeiou";
        String punctuation = "!,.?";
        Integer consonantsCount = 0;
        Integer vowelsCount = 0;
        Integer punctuationCount = 0;
        FileInputStream fileStream = new FileInputStream(
                new File("resources/words.txt"));
        FileWriter fileWriter = new FileWriter(
                new File("resources/count-chars.txt"));

        int symbol;
        while((symbol = fileStream.read())!=-1)
        {
            char ch = (char)symbol;
            if(vowels.contains(ch+"")){
                vowelsCount++;
            }else if(punctuation.contains(ch+"")){
                punctuationCount++;
            }else if(Character.isLetter(ch)){
                consonantsCount++;
            }
        }

        fileWriter.write(String.format("Vowels: %d%n", vowelsCount));
        fileWriter.write(String.format("Consonants: %d%n", consonantsCount));
        fileWriter.write(String.format("Punctuation: %d%n", punctuationCount));
        fileStream.close();
        fileWriter.close();
    }
}
