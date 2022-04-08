package edu.poniperro.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

    public static void createFile(String filename) {
        try {
            File myFile = new File(filename);
            if (myFile.createNewFile()) {
                writeToFile(filename, "1");
            }
            ;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void writeToFile(String filename, String text) {
        createFile(filename);
        try {
            FileWriter myWriter = new FileWriter(filename);
            myWriter.write(text);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile(String filename) {
        String data = "";
        createFile(filename);
        try {
            File myFile = new File(filename);
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }
}
