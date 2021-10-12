package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) {
        try {
            //open the input file
            File fp = new File("exercise46_input.txt");
            //read the file
            Scanner read = new Scanner(fp);
            //create a Map to turn the words into an integer
            Map<String, Integer> FrequencyFinder = new TreeMap<>();
            //add the values into the map
            while(read.hasNext()) {
                String word = read.next();
                //check if the line contains the key
                if(FrequencyFinder.containsKey(word)) {
                    int counter = FrequencyFinder.get(word);
                    FrequencyFinder.put(word, counter + 1);
                }
                else {
                    FrequencyFinder.put(word, 1);
                }
            }
            //print out the results
            PrintOutput.print(FrequencyFinder);
        }
        catch(Exception e) {
            System.out.println("An exception has occurred.");
        }
    }
}
