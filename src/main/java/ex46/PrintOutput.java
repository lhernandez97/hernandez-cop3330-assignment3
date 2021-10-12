package ex46;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.*;

public class PrintOutput {
    public static void print(Map<String, Integer> map) {
        //create a Set
        Set<String> keys = map.keySet();
        //print the results
        for(String key : keys) {
            System.out.printf("%-10s", key + ":");
            for(int i = map.get(key); i > 0; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
