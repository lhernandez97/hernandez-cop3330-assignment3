package ex42;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

public class App {
    public static void main(String[] args) {
        //create an object for the info class
        Info employee = new Info();
        //print the header
        System.out.println("Last             First            Salary");
        System.out.println("----------------------------------------");
        employee.fileReader();
    }
}
