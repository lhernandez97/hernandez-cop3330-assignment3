package ex41;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.*;
import java.io.*;

public class App {
   public static void main(String[] args) {
       //use a try and catch statement to catch a FileNotFoundException
       try {
           File fp = new File("exercise41_input.txt");
           Scanner read = new Scanner(fp);
           //create an ArrayList for the employees
           ArrayList<String> person = new ArrayList<>();
           //now get the info
           while(read.hasNextLine()) {
               person.add(read.nextLine());
           }
           //now sort the employees
           Collections.sort(person);
           //now call the class for creating an output file
           OutputFile.createOutputFile(person);
           //close the file
           read.close();
       }
       catch(Exception e) {
           //print the error
           System.out.println("File not found.");
       }
    }
}
