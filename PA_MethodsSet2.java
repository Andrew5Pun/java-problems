/*Andrew P
 Oct 24, 2019
 Methods Set 2*/

import java.awt.*;
import java.util.*;
import java.util.Random;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_MethodsSet2
{
    static Console c;

    public static double areaCircle (int radius)
    {
        double area; //initialize area

        area = Math.PI * radius * radius; //calculate area

        return area; //return area
    }

    public static boolean odd (int i)
    {
        boolean oe; //initialize boolean oe

        if (i % 2 == 1) {
            oe = true; //if i is odd, oe is true
        } else {
            oe = false; //if i is even, oe is false
        }

        return oe; //return oe
    }

    public static String monthName (int i)
    {
        String month = "invalid"; //initialize string month

        if (i >= 1 && i <= 12) { //check if i is within range of 1-12



            //designate the appropriate month from numbers 1-12
            if (i == 1) {
                month = "January";
            }
            if (i == 2) {
                month = "February";
            }
            if (i == 3) {
                month = "March";
            }
            if (i == 4) {
                month = "April";
            }
            if (i == 5) {
                month = "May";
            }
            if (i == 6) {
                month = "June";
            }
            if (i == 7) {
                month = "July";
            }
            if (i == 8) {
                month = "August";
            }
            if (i == 9) {
                month = "September";
            }
            if (i == 10) {
                month = "October";
            }
            if (i == 11) {
                month = "November";
            }
            if (i == 12) {
                month = "December";
            }
        }

        return month; //return month
    }

    public static int daysInMonth (int i)
    {
        int days = 0; //initialize int days

        if (i >= 1 && i <= 12) { //check if i is within range of 1-12
            if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {//if i is jan, mar, may, jul, aug, oct, dec, set days to 31.
                days = 31;
            }
            if (i == 4 || i == 6 || i == 9 || i == 11) {//if i is apr, jun, sept, nov, set days to 31.
                days = 30;
            }
            if (i == 2) {//if i is '2' (feb) set days to 28.
                days = 28;
            }
        }
        return days; //return days
    }

    public static int random (int min, int max)
    {
        int number; //initialize int number
        Random ran = new Random(); //set random seed
        number = ran.nextInt(max-min+1)+min;

        return number; //return number
    }

    public static char flip ()
    {
        char coin; //initialize char coin
        int number;

        number = random(0, 1); //choose random number from 0 to 1

        if (number == 1) {
            coin = 'H';//if number is 1, coin is heads
        } else {
            coin = 'T';//if number is not 1, coin is tails
        }

        return coin; //return coin
    }

    public static char randomLetter ()
    {
        char letter; //initialize char coin
        int number;

        number = random(65, 90); //choose random number from 65 to 90

        letter = (char)number; //convert random number to char

        return letter; //return letter
    }

    //*************************Circle Area*************************
    public static void program1 ()
    {
    c.clear ();

    int rad;
    double area;

    c.print("Enter radius of circle: "); //prompt for radius
    rad = c.readInt(); //read radius
    area = areaCircle(rad); //call areaCircle with rad value

    if (odd(rad)) c.println("The radius is odd"); //if odd is true, print statement
    else c.println("The radius is even"); //if odd is false, print statement

    c.print("Area = "); //print area
    c.print(area, 0, 1); //print area and format to 1 decimal place
    c.print(" square units");

    }
    //*************************Month Days*************************
    public static void program2 ()
    {
    c.clear ();
    c.println("Month\t\tDays"); //print months / days header
    for (int i = 1; i <= 12; i++) { //loop 12 times
        c.print(monthName(i));//print month name
        c.setCursor(c.getRow(), 17);
        c.println(daysInMonth(i)); //print days in the month
    }

    c.readChar();

    }

    //*************************Random Flips and Letters*************************
    public static void program3 ()
    {
    c.clear ();
    char coin; //initialize coin
    int percent = 0; //initialize percent at 0%
    c.print("10 coin flips: ");
    for (int i = 1; i <= 10; i++) {

        coin = flip(); //flip the coin
        c.print(coin); //print the coin status
        if (coin == 'T') percent += 10; //add 10% to tails if coin is tails

    }

    c.println("  " + percent + "% tails"); //print out percentage of tails

    c.print("\nFive random 4-letter combos: "); //five letter combos

    for (int i = 1; i <= 5; i++) { //loop 5 times

        for (int p = 1; p <= 4; p++) { //loop 4 times

            c.print(randomLetter()); //print a random letter

        }

        c.print(" "); //print a space after the 4 letters
    }

    c.readChar();

    }

    public static void main (String[] args) throws Exception
    {
        c = new Console();

        char choice;
        do {
            c.println("\n\n\nMethods Set #2");
            c.println ("--------------");
            c.println ("1. Circle Area");
            c.println ("2. Months Days");
            c.println ("3. Random Flips and Letters");
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
