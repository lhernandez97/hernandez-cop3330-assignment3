package ex43;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solution
 *  Copyright 2021 Luis Hernandez
 */

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WebsiteMaker WebsiteGenerator = new WebsiteMaker();
        //prompt for the site name
        System.out.print("Site Name: ");
        String webname = in.nextLine();
        //prompt for the author name
        System.out.print("Author: ");
        String author = in.nextLine();
        //prompt the user if they want a folder for JavaScript
        System.out.print("Do you want a folder for JavaScript? ");
        String javas = in.nextLine();
        //prompt the user if they want a folder for CSS
        System.out.print("Do you want a folder for CSS? ");
        String css = in.nextLine();
        //call the WebsiteGenerator and give the information
        WebsiteGenerator.directorypath = "./website/";
        //tell the user the creations were successful
        System.out.printf("Created %s%n", WebsiteGenerator.createWebsite(webname));
        System.out.printf("Created %s%n", WebsiteGenerator.html(webname, author));
        //if the user wants a jss folder, create one
        if(javas.equals("y") || javas.equals("Y")) {
            System.out.printf("Created %s%n", WebsiteGenerator.javascriptWebsite(webname));
        }
        //if the user wants a css folder, create one
        if(css.equals("y") || css.equals("Y")) {
            System.out.printf("Created %s%n", WebsiteGenerator.cssWebsite(webname));
        }
    }
}
