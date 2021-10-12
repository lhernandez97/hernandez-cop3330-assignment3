package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.io.*;

public class CreateFile {
    public static void fileOutput(File file, String name) {
        //create the output file
        try {
            FileWriter ofp = new FileWriter(name);
            Scanner read = new Scanner(file);
            while(read.hasNextLine()) {
                String line = read.nextLine();
                //replace the word "utilize" with "use"
                line = line.replaceAll("utilize", "use");
                //now write it all in the output file
                ofp.write(line);
                ofp.write("\n");
            }
            //close the files
            read.close();
            ofp.close();
        }
        catch(Exception e) {
            System.out.println("An exception has occurred while creating the file.");
        }
    }
}
