/*Andrew P
 Sept 7, 2019
 Problem Set 3*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_Problemset3
{
    static Console c;
    public static void main (String[] args) throws Exception
    {
        c = new Console ();


        //Chapter 11, Exercise 1
        c.println("\n======= Exercise 1 =======");

            double cost_kwh, cost; //double variable for cost of kilowatt-hours of appliance, and total cost
            int an_kwh; //integer variable for annual kilowatt-hour usage of appliance.

            c.println("Enter cost per kilowatt-hour in cents:"); //prompt for input
            cost_kwh = c.readDouble(); //assign input value to cost

            c.println("Enter cost per kilowatt-hour in cents:"); //prompt for input
            an_kwh = c.readInt(); //assign input value to annual usage

            cost = an_kwh * cost_kwh; //the cost is determined by multipling the cost per kwh and annual usage

            cost /= 100; //dividing by 100 converts the cost from cents into dollars

            c.print("Annual cost: "); //result is printed.
            c.println(cost, 0, 2); //formatted value to be 2 decimals. Formatted values cannot be printed with the other value, so it will need a separate line

            //End of project

        //Chapter 11, Exercise 3
        c.println("\n======= Exercise 3 =======");

            double X, base2log; //intializing X as double, and another variable as the answer

            c.println("Enter a double:"); //prompt for input
            X = c.readDouble(); //assigns input value to X

            base2log = Math.log(X) / Math.log(2); //to get the result, the following operations are performed

            c.print("Base 2 log of " + X + " is "); //prints out first part of result.
            c.println(base2log, 0, 2); //prints result formatted to 2 decimals

            //End of project

        //Chapter 11, Exercise 4
        c.println("\n======= Exercise 4 =======");

            double X2, Y, A, H; //initializing double variables X2 and Y, and arithmetic mean (A) and harmonic mean (H)

            c.println("Enter X:"); //prompt for input
            X2 = c.readDouble(); //assigns input value to X2

            c.println("Enter Y:"); //prompt for input
            Y = c.readDouble(); //assigns input value to Y

            A = (X2 + Y)/2; //calculating arithmetic mean

            H = 2 / (1 / X2 + 1 / Y); //calculating harmonic mean

            c.print("Arithmetic mean: \t"); //printing out arithmetic mean and using tab
            c.println(A, 0, 2); //formatting arithmetic mean to 2 decimals

            c.print("Harmonic mean: \t\t"); //printing out harmonic mean and using 2 tabs
            c.println(H, 0, 2); //formatting arithmetic mean to 2 decimals


            //End of project
    }
}
