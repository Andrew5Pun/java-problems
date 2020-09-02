/*Andrew P
 Sept 12, 2019
 Problem Set 5*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_ProblemSet5
{
    static Console c;

    //*************************Hourly Wage*************************
    public static void program1 ()
    {
    c.clear ();

    double wage, worked, pay; //doubles for hourly wage, hours worked, pay

    c.print("Hourly Wage: ");
    wage = c.readDouble(); //prompt for wage
    c.print("Hours Worked: ");
    worked = c.readDouble(); //prompt for hours worked

    if (worked > 24) { //sees if hours worked exceeds 24
        c.println("Can't work more than 24 hours."); //warns users
        worked = 24; //caps hours at 24
    }

    pay = worked * wage; //calculate pay

    c.print(worked, 0, 1); //print the hours worked
    c.print(" hrs @ $");
    c.print(wage, 0, 2); //print the hourly wage
    c.print("/hr = $");
    c.println(pay, 0, 2); //print the total pay

    }
    //*************************Meals*************************
    public static void program2 ()
    {
    c.clear ();

    String meal; //string for meal
    double price, tax; //double for price and tax
    int taxrate; //int for taxrate

    c.print("Meal: ");
    meal = c.readLine(); //prompt for meal
    c.print("Price: ");
    price = c.readDouble(); //prompt for price of meal
    c.println();
    if (price >= 4) {
        taxrate = 13;
    } else {
        taxrate = 5; //tax rate is GST + PST (5% + 8%)
    }

    tax = (taxrate/100.0)*price; //calculate the tax amount
    c.print("Taxes(" + taxrate + "%)\t$ ");
    c.println(tax, 0, 2); //print the tax amount
    c.print("Total\t\t$ ");
    c.print(price + tax, 0, 2); //print the price

    }

    //*************************Speed Limit Fine*************************
    public static void program3 ()
    {
    c.clear ();

    int speed_traveled, speed_limit;//integer for speed traveled and speed limit
    double fine = 0; //double for fine
    c.print("Speed traveled: ");
    speed_traveled = c.readInt(); //prompt for speed traveled
    c.print("Speed limit: ");
    speed_limit = c.readInt(); //prompt for speed limit
    c.println();
    if (speed_traveled > speed_limit) {
        if (speed_traveled > 10 + speed_limit) { //check if 10 km/h above speed limit

            fine = 10 * (speed_traveled - speed_limit); //$10 for every km/h above the limit

        } else {

            fine = 5 * (speed_traveled - speed_limit); //$5 for every km/h above speed limit

        }
    }

    c.print("Fine is $ ");
    c.print(fine, 0, 2); //print out the fine
    }

    //*************************Compulsory Credits*************************
    public static void program4 ()
    {
    c.clear ();

    int comp, elec; //integer for compulsory and elective credits
    c.print("Compulsory credits: ");
    comp = c.readInt(); //prompt for comp
    c.print("Elective credits: ");
    elec = c.readInt(); //prompt for elec
    c.println();
    if (comp >= 18 && elec >= 12) { //checks if there are enough compulsory credits and electives
        c.println("Congratulations - you can graduate."); //prints out congratulation statement
    } else {
        if (comp < 18) { //checks if compulsory credits are less than 18
            c.println("You need " + (18 - comp) + " more compulsory credits."); //prints out how many compulsory credits are needed

        }
        if (elec < 12) { //checks if electives are less than 12
            c.println("You need " + (12 - elec) + " more electives."); //prints out how many electives are needed
        }
    }


    }

    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        char choice;
        do {
            c.println("\n\n\nProblem Set #1");
            c.println ("--------------");
            c.println ("1. Hourly Wage");
            c.println ("2. Meals");
            c.println ("3. Speed Limit Fine");
            c.println ("4. Compulsory Credits");
            c.println ("0. Quit");
            choice = c.readChar();

            if (choice == '1')
                program1();
            else if (choice == '2')
                 program2();
            else if (choice == '3')
                program3();
            else if (choice == '4')
                program4();

        }
        while (choice != '0'); //exit when 0

    }
}
