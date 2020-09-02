/*Andrew P
 Nov 2, 2019
 Methods Set 3*/

import java.awt.*;
import java.util.*;
import java.util.Random;
import hsa.Console;
import java.io.*;
import java.lang.Math;

public class PA_MethodsSet3
{
    static Console c;

    public static String displayTime(int hours, int minutes)
    {
        String time = ""; //initialize string time (XX:XX)

        hours += minutes / 60; //add minutes to hours but leave remainder

        minutes = minutes % 60;//minutes are equal to remainder of minutes

        time += hours + ":"; //add hour to string and the colon

        if (minutes < 10) { //if minutes are less than 10 (2 digits) put a leading zero
            time += 0;
        }

        time += minutes; //add minutes to time

        return time; //return string time
    }

    public static String DisplayTime(int minutes)
    {
        String time = ""; //initialize string time (XX:XX)

        int hours; //intialize hours

        hours = minutes / 60; //convert minutes to hours but leave remainder

        minutes = minutes % 60;//minutes are equal to remainder of minutes

        time += hours + ":"; //add hour to string and the colon

        if (minutes < 10) { //if minutes are less than 10 (2 digits) put a leading zero
            time += 0;
        }

        time += minutes; //add minutes to time

        return time; //return string time
    }

    public static int elapsed (int h1, int m1, int h2, int m2) {

        int elapsedtime; //initialize elapsed time

        int totalminute1, totalminute2; //intialize total minutes for time 1 and total minutes for time 2

        totalminute1 = h1 * 60 + m1; //add h1 and m1 together to form total minutes

        totalminute2 = h2 * 60 + m2; //add h2 and m2 together to form total minutes

        elapsedtime = Math.abs(totalminute1 - totalminute2); //elapsed time is the difference between total minutes of both times and absolute value

        return elapsedtime;

    }

    public static int random (int min, int max) //random function taken from methods set 2
    {
        int number; //initialize int number
        Random ran = new Random(); //set random seed
        number = ran.nextInt(max-min+1)+min;

        return number; //return number
    }

    public static int getCard () {

        int card; //initialize card

        card = random(2, 14); //set card to random int from 2 to 14

        return card;

    }

    public static String showCard (int card) {

        String displayedcard; //initialize displayed card

        displayedcard = Integer.toString(card); //set displayed card to string. This will work from 2-10

        //special cases below
        if (card == 11) { //if card is 11, the card is a jack
            displayedcard = "J";
        }
        if (card == 12) { //if card is 12, the card is a queen
            displayedcard = "Q";
        }
        if (card == 13) { //if card is 13, the card is a king
            displayedcard = "K";
        }
        if (card == 14) { //if card is 11, the card is an ace
            displayedcard = "A";
        }

        return displayedcard;

    }

    public static char getChoice(char a, char b)
    {
        char chosenchar; //intialize character chosen char
        c.readChar();
        chosenchar = c.readChar(); //read the character

        while (chosenchar != a && chosenchar != b) { //make sure character is either a or b

            c.print("You must enter either " + a + " or " + b + ": "); //if not, prompt for proper input
            c.readChar();
            chosenchar = c.readChar(); //read input
        }

        return chosenchar;

    }

    public static int cardValue(int card) {

        int value; //initialize value

        value = card; //value is the same as the card for 2-10

        //special cases below
        if ( card == 11 || card == 12 || card == 13) { //if card is 11, 12, 13, value is 10
            value = 10;
        }
        if (card == 14) { //if card is 14, value is 11
            value = 11;
        }

        return value;

    }

    //*************************Time*************************
    public static void program1 ()
    {
    c.clear ();
    int minute; //initialize minutes
    c.print("Enter a time in minutes: "); //prompt for minute
    minute = c.readInt();

    c.println("The time is " + DisplayTime(minute)); //display the time
    c.println();

    int hour1, minute1, hour2, minute2; //initialize hour1, hour2, minute1, minute2

    c.println("Enter two times in hours and minutes");

    c.print("1.\tHours: "); //prompt for hour1
    hour1 = c.readInt();
    c.print("\tMinutes: "); //prompt for minute1
    minute1 = c.readInt();

    c.print("2.\tHours: "); //prompt for hour2
    hour2 = c.readInt();
    c.print("\tMinutes: "); //prompt for minute 2
    minute2 = c.readInt();

    c.println();
    c.println(elapsed(hour1, minute1, hour2, minute2) + " minutes have elapsed from " + displayTime(hour1, minute1) + " to " + displayTime(hour2, minute2)); //display the elapsed time

    }
    //*************************21*************************
    public static void program2 ()
    {
    c.clear ();
    int playerscore, compscore; //initialize scores
    int playercard1, playercard2; //initialize player cards
    int compcard1, compcard2; //initialize computer's cards
    int drawncard; //initialize drawn card

    //drawing the starting cards
    playercard1 = getCard();
    playercard2 = getCard();
    compcard1 = getCard();
    compcard2 = getCard();

    //playercard1 = 12;
    //playercard2 = 5;

    //playercard1 = 14;
    //playercard2 = 14;

    compcard1 = 1;
    compcard2 = 1;

    playerscore = cardValue(playercard1) + cardValue(playercard2); //calculate player card score
    compscore = cardValue(compcard1) + cardValue(compcard2); //calculate computer card score

    c.print("Player's Cards: ");
    c.println(showCard(playercard1) + " " + showCard(playercard2)); //display player's cards
    c.print("Computer's Cards: ");
    c.println(showCard(compcard1) + " " + showCard(compcard2) + "\n"); //display computer's cards

    char choice = 't'; //initialize choice t/s

    //c.print("Take or stop (t/s): ");
    //choice = getChoice('t', 's');
    if (playerscore <= 21) { //check if player score is less than or equal to 21
    c.print("Take or stop (t/s): "); //prompt for t or s
    choice = getChoice('t', 's'); //get choice t or s
}
    while (playerscore <= 21 && choice == 't') {


        drawncard = getCard(); //get a card

        c.println("Player draws " + showCard(drawncard)); //display player card

        playerscore += cardValue(drawncard); //add value of card to player score

        //c.println(playerscore);

        if(playerscore <= 21) { //check if score is less than 21
            c.print("Take or stop (t/s): "); //prompt for t or s
            choice = getChoice('t', 's'); //get choice t or s
        }

    }
    c.readChar();
    if (playerscore > 21) { //if player is over 21 they lose
        c.println("Busted with " + playerscore + "!"); //display score
        c.println("Computer wins."); //display that computer won
    } else {
        c.println();
        while (compscore <= 21 && compscore <= 16) { //check if computer score is less than or equal to 16. Computer will only draw at 16
        drawncard = getCard(); //get a card

        c.println("Computer draws " + showCard(drawncard)); //display computer card

        compscore += cardValue(drawncard); //add value of card to computer score

        }

        if (compscore > 21) { //if computer is over 21 they lose
        c.println("Busted with " + compscore + "!"); //display score
        c.println("Player wins."); //display that player won
    } else {

        c.println("Computer stops."); //if computer did not have more than 21 then it means they stopped
        if (playerscore > compscore) { //if player has higher score player wins
            c.println("Player wins " + playerscore + " to " + compscore + ".");
        }
        if (playerscore == compscore) { //check if it's a tie
            c.println("It is tied " + playerscore + " to " + compscore + ".");
        }
        if (compscore > playerscore) { //if computer has higher score computer wins
            c.println("Computer wins " + compscore + " to " + playerscore + ".");
        }
    }


    }



    }

    public static void main (String[] args) throws Exception
    {
        c = new Console();

        char choice;
        do {
            c.println("\n\n\nMethods Set #3");
            c.println ("--------------");
            c.println ("1. Time");
            c.println ("2. Black Jack");
            c.println ("0. Quit");
            choice = c.readChar();

            if (choice == '1')
                program1();
            else if (choice == '2')
                program2();

        }
        while (choice != '0'); //exit when 0


    }
}
