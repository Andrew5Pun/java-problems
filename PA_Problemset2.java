/*Andrew P
 Sept 5, 2019
 Problem Set 2*/

import java.awt.*;
import java.util.*;
import java.util.Scanner;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_Problemset2
{
    static Console c;
    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        c.println("\n======= Area of a Circle =======");

        //Area of a Circle project

        int rad; //initialize integer radius
        double area; //initialize double area
        c.print("Input the radius: "); //prompt for input
        rad = c.readInt(); //read input
        area = Math.PI * Math.pow(rad, 2); //perform pi*r^2 formula to get the area of the circle.
        c.println("The radius is: " + rad + ". The area is: " + area + "."); //print the result


        //End of project

        c.println("\n======= Correct Change =======");

        //Correct Change project

        int cents, dollar, quarter, dime, nickel; //intializing variables for for total cents and the amount of coins.
        c.print("Type in the amount of cents: "); //prompt for input
        cents = c.readInt(); //read input

        c.print("Your change is: "); //start the output statement.

        dollar = cents / 100; //checks how many dollars can make up the cents.
        cents %= 100; //removes money formed from dollars from cents to get remaining cents.

        c.print(dollar + " dollar"); //prints amount of dollars
        if (dollar != 1) { //checks if amount of dollars is plural for grammar's sake.
            c.print("s");
        }

        quarter = cents / 25; //checks how many quarters can make up the remaining cents.
        cents %= 25; //removes money formed from quarters from cents to get remaining cents.

        c.print(", " + quarter + " quarter"); //prints amount of quarters
        if (quarter != 1) { //checks if amount of quarters is plural for grammar's sake.
            c.print("s");
        }

        dime = cents / 10; //checks how many dimes can make up the remaining cents.
        cents %= 10; //removes money formed from dimes from cents to get remaining cents.

        c.print(", " + dime + " dime"); //prints amount of dimes
        if (dime != 1) { //checks if amount of dimes is plural for grammar's sake.
            c.print("s");
        }

        nickel = cents / 10; //checks how many nickels can make up the remaining cents.
        cents %= 10; //removes money formed from nickels from cents to get remaining cents.

        c.print(", " + nickel + " nickel"); //prints amount of nickels
        if (nickel != 1) { //checks if amount of nickels is plural for grammar's sake.
            c.print("s");
        }

        c.print(", and " + cents + " cent");//prints amount of cents
        if (cents != 1) { //checks if amount of cents is plural for grammar's sake.
            c.print("s");
        }
        c.print(".\n"); //prints a period and a new line at the end of the statement.


        //End of project

        c.println("\n======= Ohm's Law =======");

        //Ohm's Law project

        int V, R; //initializing integers V and R
        double I; //initializing double I
        c.print("Type in the voltage of the device: "); //prompts for input
        V = c.readInt(); //takes in voltage
        c.print("Type in the resistance of the device: "); //prompts for input
        R = c.readInt(); //takes in resistance
        I = (V + 0.0)/R; //performs calculation with Ohm's Law formula
        c.println("The current of the device is " + I + " amps."); //prints result


        //End of project
    }
}
