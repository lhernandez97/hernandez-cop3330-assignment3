package ex45;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;
import java.io.File;

public class App {
    public static void main(String[] args) {
        //read the input file
        try {
            File fp = new File("exercise45_input.txt");
            //create Scanner object to take in input
            Scanner in = new Scanner(System.in);
            //prompt the user for the output file name
            System.out.println("Please give a file name:");
            String name = in.nextLine();
            //now create the output file
            CreateFile.fileOutput(fp, name);
        }
        catch(Exception e) {
            System.out.println("An exception has occurred.");
        }
    }
}
