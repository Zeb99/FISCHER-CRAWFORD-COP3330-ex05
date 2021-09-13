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

        int add = numOne + numTwo;
        int sub = numOne - numTwo;
        int pro = numOne * numTwo;
        int quo = numOne / numTwo;

        System.out.println(numOne + " + " + numTwo + " = " + add + "\n" +
                           numOne + " - " + numTwo + " = " + sub + "\n" +
                           numOne + " * " + numTwo + " = " + pro + "\n" +
                           numOne + " / " + numTwo + " = " + quo);

    }
}
