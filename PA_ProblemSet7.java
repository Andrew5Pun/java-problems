/*Andrew P
 Oct 1, 2019
 Problem Set 7*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_ProblemSet7
{
    static Console c;

    //*************************Miles per Gallon*************************
    public static void program1 ()
    {
    c.clear ();
    int initialm, finalm, gallons; //initialize initial miles, final miles, gallons
    double mpg; //initialize miles per gallon
    c.println("Miles Per Gallon Program");
    c.println("Initial miles:"); //request initial miles
    initialm = c.readInt();

    while(initialm != -1) { //repeat until initialm is -1
            c.println("Final miles:"); //request final miles
            finalm = c.readInt();
            c.println("Gallons:"); //request gallons
            gallons = c.readInt();
            mpg = (finalm - initialm)/(gallons*1.0); //calculate miles per gallon
            c.print("Miles per Gallon: "); //display miles per gallon
            c.println(mpg, 0, 1);
            c.println("\nInitial miles:"); //request initial miles again
            initialm = c.readInt();
        }
    c.println("\nbye");

    }
    //*************************In-range Adder*************************
    public static void program2 ()
    {
    c.clear ();
    c.println("In-range Adder");

    int low, high, data, inrange = 0, outrange = 0; //initialize low end and high end. Also initialize in-range sum and out of range sum, and data

    c.println("Low end of range:"); //request low end
    low = c.readInt();

    c.println("High end of range:"); //request high end
    high = c.readInt();

    c.println("Enter data:"); //request integer
    data = c.readInt();

    while(data != 0) { //repeat until integer is 0

            if (data < low || data > high) { //check if integer is in range
                outrange += data; //add integer to out of range if it is out of range
            } else {
                inrange += data; //add integer to in range if it is in range
            }

            c.println("Enter data:"); //request integer again
            data = c.readInt();

        }

    c.println("Sum of in range values: " + inrange); //display sum of in-range values
    c.println("Sum of out of range values: " + outrange); //display sum of out of range values

    }

    //*************************Shipping Cost Calculator*************************
    public static void program3 ()
    {
    c.clear ();

    int weight; //initialize weight
    double cost; //initialize cost

    c.println("Weight of Order:"); //request weight
    weight = c.readInt();

    while (weight != 0) { //loop until weight is 0
            cost = 3; //cost is $3 at first
            if (weight > 10) { //check if cost exceeds 10
                for (int i = 10; i < weight; i++) { //a loop to add 0.25 every pound over 10

                    cost += 0.25; //add the cost

                }
            }

            c.print("Shipping Cost: $"); //print the shipping cost
            c.println(cost, 0, 2);
            c.println("\nWeight of Order:"); //request weight
            weight = c.readInt();

        }

    c.println("\nbye");
    }

    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        char choice;
        do {
            c.println("\n\n\nProblem Set #7");
            c.println ("--------------");
            c.println ("1. Miles per Gallon");
            c.println ("2. In-range Adder");
            c.println ("3. Shipping Cost Calculator");
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
