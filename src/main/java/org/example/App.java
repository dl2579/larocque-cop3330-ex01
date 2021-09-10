package org.example;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */
public class App //A public class must be placed in a file that has a filename of the form ClassName.java
{
    public static void main( String[] args )
    {

        System.out.println( "What is your name?" );

        String name;

        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();

        System.out.printf("Hello, %s, nice to meet you!%n", name);


    }
}
