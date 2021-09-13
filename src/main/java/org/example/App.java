package org.example;
import java.util.Scanner;

/**
 * Simple Math
 *  UCF cop3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number? ");
        int numOne = scan.nextInt();

        System.out.println("What is the second number? ");
        int numTwo = scan.nextInt();

        System.out.println(numOne + " + " + numTwo + " = " + numTwo+numOne );
        //System.out.println();
       //System.out.println();
        //System.out.println();


    }
}
