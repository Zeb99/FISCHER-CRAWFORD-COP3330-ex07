package org.example;
import java.util.Scanner;

/**
 * Area of a Room
 * UCF cop3330 Fall 2021 Assignment 7 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )

    {
        Scanner scan = new Scanner(System.in);
        double conversion = 0.09290304;

        System.out.println("What is the length of the room in feet? ");
        int length = scan.nextInt();
        System.out.println("What is the width of the room in feet? ");
        int width  = scan.nextInt();
        System.out.println("you entered the dimesions of " + length + " feet by " + width + " feet.");

        int areaInFeet = length * width;
        float areaInMeters = (float) ((areaInFeet) * conversion);

        System.out.println("The area is\n" + areaInFeet + " square feet\n" + areaInMeters + " square meters" );
    }
}
