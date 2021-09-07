package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	//Think Java - Exercise 3.3

        //Import Statement used
        Scanner userInput = new Scanner(System.in);

        //Variables named
        int howManySeconds;
        int hours;
        int minutes;
        int seconds;

        //Asking user for an input.
        System.out.println("Enter a number of seconds: ");
        howManySeconds = userInput.nextInt();

        //Variables are given a value
        hours = (howManySeconds / 3600);
        minutes = ((howManySeconds % 3600) / 60);
        seconds = (howManySeconds % 60);

        //Output
        System.out.printf("Total amount of seconds converted to hours, minutes and seconds: %d", howManySeconds);
        System.out.printf(" = %d hours,", hours);
        System.out.printf(" %d minutes,", minutes);
        System.out.printf(" %d seconds", seconds);

    }
}
