/*Andrew P
 Sept 5, 2019
 Problem Set 1*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_Problemset1
{
    static Console c;
    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        c.println("\n======= Value of a Quadradic =======");

        //Quadratic Function project

        double X, num; //intialize variable X, and changing variable "num"
        num = 4; //assign value to num
        X = num; //assign X to value of num
        double ans; //intialize variable ans for the answer
        ans = 3 * Math.pow(X, 2) - 8 * X + 4; //give ans the value of the quadratic formula for value X.
        c.println("At X = " + X + " the value is " + ans);


        //End of project

        c.println("\n======= Average Rain Fall =======");

        //Average Rainfall project

        int ap, may, jun; //initializing variables for rainfalls of April, May, and June
        ap = 12; //assigning values for each variable.
        may = 14;
        jun = 8;

        double avg; //intializing variable for average

        avg = ap + may + jun; //adding up all the rainfalls
        avg /= 3; //dividing value of total rainfall by 3 to get the average

        c.print("Rainfall for April:"); //print out all the values
        c.println("\t" + ap); //tabulation character ensures that the numbers will all be lined up when printed.
        c.print("Rainfall for May:");
        c.println("\t" + may);
        c.print("Rainfall for June:");
        c.println("\t" + jun);
        c.print("Average rainfall:");
        c.print("\t");
        c.println(avg, 8); //the second parameter states how any digits are displayed


        //End of project

        c.println("\n======= Degrees to Radians =======");

        //Degrees to Radians project

        double rad, degrees; //initialize variables rad and degrees
        degrees = 30; //give value to degrees, in this case 30 degrees
        rad = degrees * Math.PI/180; //convert value of degrees to rad using Math.PI
        c.print(degrees + " degrees is equal to " + rad + " radians"); //prints result


        //End of project
    }
}
