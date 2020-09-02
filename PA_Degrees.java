/*Andrew P
 Sept 5, 2019
 Degrees to radians*/

import java.awt.*;
import java.util.*;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_Degrees
{
    static Console c;
    public static void main (String[] args) throws Exception
    {
        c = new Console ();
        double rad, degrees;//initialize variables rad and degrees
        degrees = 180;//give value to degrees
        rad = degrees * Math.PI/180;//convert value of degrees to rad using Math.PI
        c.print(degrees + " degrees is equal to " + rad + " radians");//print result.
    }
}
