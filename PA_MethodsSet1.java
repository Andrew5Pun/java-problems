/*Andrew P
 Oct 19, 2019
 Methods Set 1*/

import java.awt.*;
import java.util.*;
import java.util.Random;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_MethodsSet1
{
    static Console c;

    //*************************Drug Potency*************************
    public static void title (String title, int equals)
    {

        for (int i = 0; i < equals; i++) { //loop for amount of equals
            c.print("="); //print equal sign
        }

        c.print(" " + title + " "); //print title with spaces

        for (int i = 0; i < equals; i++) { //loop for amount of equals
            c.print("="); //print equal sign
        }
        c.println("\n");
    }
    //*************************Hailstone Numbers*************************
    public static void box (int y, int x)
    {
        for (int i = 1; i <= y; i++) { //index through columns

            for (int p = 1; p <= x; p++) { //index through row

                c.print("o"); //print o

            }

            c.println(); //print a new line after every row

        }
        c.println();
    }

    //*************************Further Improved Guessing Game*************************
    public static void newBox (int y, int x)
    {
        for (int i = 1; i <= y; i++) { //index through columns

            for (int p = 1; p <= x; p++) { //index through row

                if (i == 1 || i == y || p == 1 || p == x) { //check if x,y is on the perimeter of the box

                    c.print("o"); //if it's on the perimeter, print o

                } else {
                    c.print(" "); //if it's not, print space
                }

            }

            c.println(); //print new line after every row

        }
        c.println();
    }

    public static void main (String[] args) throws Exception
    {
        c = new Console();

        title("ICS3U1 Methods Set 1", 10); //call title

        int x, y; //initialize x and y

        c.println("Enter box dimensions");
        c.print("Width: "); //prompt for x
        x = c.readInt();
        c.print("Height: "); //prompt for y
        y = c.readInt();
        c.println();

        box(y, x); //call box

        newBox(y, x); //call new box



    }
}
