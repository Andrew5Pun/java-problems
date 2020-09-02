/*Andrew P
 Sept 12, 2019
 Problem Set 4*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_Problemset4
{
    static Console c;
    //*************************Last Chance Gas*************************
    public static void program1 ()
    {
    c.clear ();
    int capacity, gage, mpg, tank_perc, possible_miles; //initialize capacity, gage, miles per gallon, gas in tank, possible miles
    c.println("Tank capacity:");
    capacity = c.readInt (); //request capacity
    c.println("Gage reading:");
    gage = c.readInt (); //request gage
    c.println("Miles per gallon:");
    mpg = c.readInt (); //request mpg

    tank_perc = (capacity * gage)/100; //calculating how much gas left. Important that capacity * gage is done first since these are integers and anything below 1 is just 0.
    possible_miles = tank_perc * mpg;
    if (possible_miles >= 200) {
        c.println("Safe to Proceed.");
    } else {
        c.println("Get Gas!");
    }

    }

    //*************************Wind Chill Index*************************
    public static void program2 ()
    {
    c.clear ();
    double v, t, WCI; //initialize wind velocity, temperature and wind chill index
    c.println("Wind speed (miles per hour):");
    v = c.readDouble (); //request velocity
    c.println("Temperature (Fahrenheit):");
    t = c.readDouble (); //request mpg

    if (v >= 0 && v <= 4) { //check if 4 <= v <= 0
        WCI = t; //WCI is equal to t
    } else {
        if (v >= 45) { //check if v >= 45
            WCI = 1.6 * t - 55; //calculation is performed
        } else {
            WCI = 91.4 + (91.4 - t) * (0.0203 * v - 0.304 * Math.sqrt(v) - 0.474); //calculation is performed
        }
    }

    c.print("The wind chill index is ");
    c.print(WCI, 0, 2); //print the wind chill index
    c.println(" °F");
    }
    //*************************Internet Delicatessen*************************
    public static void program3 ()
    {
    c.clear ();
    String item; //initialize item
    double price, shipping, total; //initialize price, shipping and total.
    int delivery = 3, tabs; //initialize delivery, tabs for formatting

    c.print("Enter the item: ");
    item = c.readLine(); //request item
    c.print("Enter the price (cents): ");
    price = c.readDouble (); //request item
    while (delivery != 0 && delivery != 1) {
    c.print("Overnight delivery (0==no, 1==yes): ");
    delivery = c.readInt (); //request overnight delivery
    if (delivery != 0 && delivery != 1) {
        c.println("Please enter a number between 0 and 1."); //makes sure that user inputs 0 or 1
    }
}

    price /= 100; //convert price to dollars
    if (price < 10) {
        shipping = 2; //shipping is $2 for items under $10
    } else {
        shipping = 3; //shipping is $3 for items equal to or over $10
    }

    tabs = ((item.length()+3)/8); //formatting for how many tabs based on how long item name is
    if (delivery == 1) {
        shipping += 5;
    }
    total = shipping + price; //calculate total
    c.println("\nInvoice:");
    c.print("   " + item + "\t\t");
    c.println(price, 10, 2); //print price
    c.print("   shipping\t");
    for (int i = 0; i < tabs; i++) {
        c.print("\t");
    }
    c.println(shipping, 10, 2); //print shipping
    c.print("   total\t");
    for (int i = 0; i < tabs; i++) {
        c.print("\t");
    }
    c.println(total, 10, 2); //print total
    }

    //*************************Menu Program Here*************************
    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        char choice;
        do {
            c.println("\n\n\nProblem Set #1");
            c.println ("--------------");
            c.println ("1. Last Chance Gas");
            c.println ("2. Wind Chill Index");
            c.println ("3. Internet Delicatessen");
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
