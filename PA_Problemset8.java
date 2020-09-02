/*Andrew P
 Oct 7, 2019
 Problem Set 8*/

import java.awt.*;
import java.util.*;
import java.util.Random;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_Problemset8
{
    static Console c;

    //*************************Drug Potency*************************
    public static void program1 ()
    {
    c.clear ();
    double effectiveness = 100; //set effectiveness to 100
    int months = 0; //set months to 0


    while (effectiveness >= 50) { //check if effectiveness is still >= 50


        c.println("month: " + months + "\teffectiveness: " + effectiveness); //display month and effectiveness
        effectiveness *= 0.96; //decrease effectiveness by 4%
        months++; //add 1 to months
    }
    c.print("month: " + months + "\teffectiveness: " + effectiveness); //display month and effectiveness
    c.println(" DISCARDED"); //print that the drug has been discarded
    c.readChar();
    }
    //*************************Hailstone Numbers*************************
    public static void program2 ()
    {
    c.clear ();
    int number;
    c.print("Type in a number: "); //prompt for number

    number = c.readInt();

    while (number != 1) {
        c.print(number + "\t");
        if (number % 2 == 0) { //if number is odd, divide by 2
            c.println("(even, next value is " + number + "/2)");
            number /= 2;
        } else { //if number is odd, number is multiplied by 3 and increased by 1
            c.println("(odd, next value is 3*" + number + "+1)");
            number = number * 3 + 1;

        }
    }
    c.println(number + "\t" + "(stop calculation)"); //print the last number (which will be 1)
    }

    //*************************Further Improved Guessing Game*************************
    public static void program3 ()
    {
    c.clear ();
    Random ran = new Random(); //set random seed
    int number, guess, roundswon = 0; //initialize number, guess, and rounds won
    int tries; //initialize tries

    for (int i = 1; i <= 10; i++) {
        c.println("round " + i + ":\n"); //display round number
        guess = 0; //set guess to zero
        tries = 0; //set attempts to zero
        number = ran.nextInt(10)+1; //choose a random int from 1 to 10

        c.println("I am thinking of a number from 1 to 10.");
        c.println("You must guess what it is in three tries.");
        c.println("Enter a guess:");
        while (guess != number && tries < 3) { //allow for 3 attempts

            guess = c.readInt(); //input attempt

            tries++; //add one to attempt
            if (guess == number) { //check if answer is correct
                c.println("RIGHT!");
                roundswon++;
            } else {
                if (tries == 3) { //check how many tries are left
                    c.println("wrong");
                    c.println("The correct number was " + number); //display correct number
                } else {
                    int proximity = Math.abs(number - guess); //calculate proximity
                    if (proximity == 1) {
                        c.println("hot"); //if proximity is 1, print hot
                    }
                    if (proximity == 2) {
                        c.println("warm"); //if proximity is 2, print warm
                    }
                    if (proximity >= 3) {
                        c.println("cold"); //if proximity is 3 or more, print cold
                    }
            }
        }


        }
        c.println("You have won " + roundswon + " of " + i + " rounds.\n"); //print how many rounds won
    }

    String rating = "";

    if (roundswon <= 7) { //rounds won are 7 or less
        rating = "ameteur"; //set rating to ameteur
    }
    if (roundswon == 8) { //rounds won are 8
        rating = "advanced"; //set rating to advanced
    }
    if (roundswon == 9) { //rounds won are 7 or less
        rating = "professional"; //set rating to professional
    }
    if (roundswon == 10) {
        rating = "hacker"; //set rating to hacker
    }

    c.println("Your rating: " + rating + ".");

    }

    public static void main (String[] args) throws Exception
    {
        c = new Console (32, 100);
        char choice;
        do {
            c.println("\n\n\nProblem Set #8");
            c.println ("--------------");
            c.println ("1. Drug Potency");
            c.println ("2. Hailstone Numbers");
            c.println ("3. Further Improved Guessing Game");
            c.println ("0. Quit");
            choice = c.readChar();

            if (choice == '1')
                program1();
            else if (choice == '2')
                program2();
            else if (choice == '3')
                program3();

        }
        while (choice != '0'); //exit when 0
    }
}
