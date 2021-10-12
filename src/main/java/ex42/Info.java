package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.*;
import java.io.*;

public class Info {
    public void fileReader() {
        //read in the file to get the input
        try {
            File fp = new File("exercise42_input.txt");
            Scanner read = new Scanner(fp);
            //read the file
            while(read.hasNextLine()) {
                String info = read.nextLine();
                //split the lines from the commas
                String[] line = info.split(",");
                //print the names
                System.out.printf("%-17s%-17s%-17s%n", line[0], line[1], line[2]);
            }
        }
        //handle the FileNotFoundException
        catch(FileNotFoundException e) {
            System.out.println("The file has not been found");
        }
    }
}
