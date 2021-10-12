package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class OutputFile {
    public static void createOutputFile (ArrayList<String> info) {
        //create a FileWriter
        try {
            FileWriter ofp = new FileWriter("exercise41_output.txt");
            //now create the output file
            ofp.write("Total of " + info.size() + " names" + "\n");
            ofp.write("-----------------" + "\n");
            //now add the names
            for(String name : info) {
                ofp.write(name + "\n");
            }
            //close the file
            ofp.close();
        }
        catch(IOException e) {
            System.out.println("Something went wrong.");
        }
    }
}
