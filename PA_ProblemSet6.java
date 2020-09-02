/*Andrew P
 Sept 26, 2019
 Problem Set 6*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_ProblemSet6
{
    static Console c;

    //*************************Adding Up Integers*************************
    public static void program1 ()
    {
    c.clear ();
    int n, sum = 0; //initialize number of integers n and the sum

    c.println("How many integers will be added: "); //prompt for input
    n = c.readInt(); //initialize n

    for (int i = 0; i < n; i++) { //loop "n" times

        c.println("Enter an integer:"); //prompt for input

        sum += c.readInt(); //adds new inputted integer to sum

    }

    c.println("The sum is " + sum + "."); //print sum

    }
    //*************************Compute Sum*************************
    public static void program2 ()
    {
    c.clear ();
    int N; //initialize N
    double sum = 0; //initialize sum at 0

    c.println("Enter N:"); //prompt for input
    N = c.readInt(); //input N

    for (int i = 1; i <= N; i++) { //loop N times
        sum += 1.0/i; //add sum of 1.0/i

    }

    c.println("Sum is: " + sum); //print sum

    }

    //*************************Standard Deviation*************************
    public static void program3 ()
    {
    c.clear ();
    double SD, num, avgsquare = 0, avg = 0; //initialize SD and num
    int N; //initialize N
    c.println("Enter how many floating point numbers you want:");
    N = c.readInt();

    for (int i = 1; i <= N; i++) {

        c.println("Enter a floating point number:");

        num = c.readDouble();

        avg += num;

        avgsquare += num * num;

    }

    avg /= N; //calculate the actual average by dividing by number of numbers
    avgsquare /= N; //calculate the actual average by dividing by number of numbers

    SD = Math.sqrt(avgsquare - avg * avg); //calculate standard deviation

    c.println("The standard deviation is " + SD + "."); //print the standard deviation

    }

    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        char choice;
        do {
            c.println("\n\n\nProblem Set #6");
            c.println ("--------------");
            c.println ("1. Adding Up Integers");
            c.println ("2. Compute Sum");
            c.println ("3. Standard Deviation");
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
