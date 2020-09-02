
    /*Andrew P
     Dec 2, 2019
     Array Set 1*/

    import java.awt.*;
    import java.util.*;
    import java.util.Random;
    import hsa.Console;
    import java.io.*;
    import java.text.Collator;
    import java.lang.Math;
    import java.util.Arrays;

    public class PA_ArraySet1
    {
        static Console c;


        public static String[] fill (String fname) throws IOException
        {

            FileReader fr = new FileReader (fname); //read the file name
            BufferedReader filein = new BufferedReader (fr); //initialize buffer

            String[] list = new String[100000]; //create new string that has an arbituary size
            String line;
            int counter = 0;
            while ((list[counter] = filein.readLine ()) != null) { //file has not ended
                counter++;
            }
                String newlist[] = new String[counter];
           for (int i = 0; i < counter; i++) {
                    newlist[i] = list[i]; //put all items from list into newlist
           }

           filein.close (); // close file


           return newlist;
        }

        public static String[] enter () {

            String list[] = new String[100000];
            c.println("Enter names (first, last - q to quit)."); //prompt for input
            String name = c.readLine(); //read name
            int counter = 0; //initialize counter
            while (!name.equals("q")) { //loop while input is not q
                list[counter] = name; //put input into list
                counter++; //increase counter by 1
                name = c.readLine(); //read name again
            }
            //c.println(counter);
            String newlist[] = new String[counter]; //create new array with correct size
            for (int i = 0; i < counter; i++) {
                newlist[i] = list[i]; //put all items from list into newlist
            }
            //c.println(newlist.length);
            return newlist;
        }

        public static void print (String[] list) {

            for (int i = 0; i < list.length; i++) { //loop for how many elements in array
                c.println(list[i]); //print element in array

            }

        }

        public static String[] search (String[] list, char a) { //overloaded method search that takes in character and checks array for elements that start with character

            int counter = 0;
            String[] list2 = new String[list.length]; //array for copying elements

            for (int i = 0; i < list.length; i++) { //loop for how many elements in array
                if (list[i].charAt(0) == a) { //check if element starts with char a
                    list2[counter] = list[i];//add element into list2
                    counter++; //increase counter by 1
                }

            }
            String[] newlist = new String[counter]; //new array with correct size

            for (int i = 0; i < counter; i++) {//loop for counter amount of times

                newlist[i] = list2[i]; //copy elements from list 2 into newlist
            }

            return newlist;
        }

        public static String[] search (String[] list, String a) { //overloaded method search that accepts surname and checks elements that contain surname

            int counter = 0;
            String[] list2 = new String[list.length]; //array for copying elements

            for (int i = 0; i < list.length; i++) { //loop for how many elements in array
                //String[] split_name = list[i].split(","); //this was originally here for searching for the surname, where it would split the name at the comma and pass it as a string to read
                if (list[i].equals(a)) { //check if name is equal to String a
                    list2[counter] = list[i];//add element into list2
                    counter++; //increase counter by 1
                }

            }
            String[] newlist = new String[counter]; //new array with correct size

            for (int i = 0; i < counter; i++) { //loop for counter amount of times

                newlist[i] = list2[i]; //copy elements from list 2 into newlist
            }

            return newlist;
        }

        public static String[] add (String[] list, String name) {

          String[] newlist = new String[list.length+1]; //make a new array with 1 more capacity than given list
            for (int i = 0; i < list.length; i++) { //loop for list.length

                newlist[i] = list[i]; //copy elements into newlist

            }
            newlist[list.length] = name;//append name to last element of newlist (since arrays start at 0, the last element is at position list.length)


            return newlist;
        }

        public static String[] remove (String[] list, int pos) {


            if (pos >= 0 && pos < list.length && list.length > 0) { //check if pos is valid and list is not empty
            String[] newlist = new String[list.length-1]; //make a new array with 1 less capacity than given list
            int counter = 0; //there has to be a separate accumulator for the loop since we may skip a position
            for (int i = 0; i < list.length; i++) {
                if (i != pos) { //check if i is not the position specified
                    newlist[counter] = list[i]; //copy element "i" of list into element "counter" of variable
                    counter++;
                }


            }
            return newlist;
        }

            return list; //if the list is empty or pos is invalid then the original list will just be returned
        }

        public static void sort(String[] list) {

            String temp;
            //Using selection sort
            for (int x = 0 ; x < list.length - 1 ; x++) {//sort first length - 1 values
                Collator myCollator = Collator.getInstance(); //collator is used to compare two strings in default locale (sorted alphabetically, regardless of case)
                int lowPos = x; //assume the first value is lowest

                for (int y = x + 1; y < list.length; y++) {// check rest of list
                    if (myCollator.compare(list[y], list[lowPos]) < 0) { //if you find a lower value alphabetically

                        lowPos = y; //make it the lowest
                    }
                }

        temp = list[x]; //swap low value with value in its proper position

        list [x] = list [lowPos]; //change list[x] to list[lowPos]

        list [lowPos] = temp; //change list[lowPos] into temporary variable for swapping

    }
        }

    public static String[] program1(String[] list) throws IOException
    {
        c.clear();
        String filename;
        c.println("Read names from file");
        c.println ("--------------");
        c.print("Input file name: ");
        filename = c.readString();
        c.println ("--------------");
        list = fill(filename);
        print(list);

        c.println("\nPress any key to continue.");

        c.readChar();

        return list;
    }

    public static String[] program2(String[] list) throws IOException
    {
        c.clear();
        c.println("Input names from keyboard");
        c.println ("--------------");
        list = enter();
        c.println("--------------");
        print(list);

        c.println("\nPress any key to continue.");

        c.readChar();

        return list;
    }

    public static String[] program3(String[] list) throws IOException
    {
        c.clear();
        char choice;
        c.println("Search array for name(s)");
        c.readChar();
        c.println ("--------------");
        c.println ("1. Search by starting letter");
        c.println ("2. Search by name");
        choice = c.readChar();

            if (choice == '1')
                program3a(list);
            else if (choice == '2')
                program3b(list);


        return list;
    }

    public static void program3a(String[] list) throws IOException
    {
        c.clear();
        c.readChar();
        c.println("Search by starting letter");
        c.println ("--------------");
        char i;
        c.print("Type in the starting letter you want to search for: ");
        i = c.readChar();

        String[] list2 = search(list, i);

        c.println("--------------");
        print(list2);

        c.println("\nPress any key to continue.");

        c.readChar();
        c.readChar();

    }

    public static void program3b(String[] list) throws IOException
    {
        c.clear();
        c.readChar();
        c.println("Search by name");
        c.println ("--------------");
        String i;
        c.print("Type in the name you want to search for: ");
        i = c.readLine();

        String[] list2 = search(list, i);

        c.println("--------------");
        print(list2);

        c.println("\nPress any key to continue.");

        c.readChar();

    }

    public static String[] program4(String[] list) throws IOException
    {
        c.clear();
        c.readChar();
        c.println("Add names");
        c.println ("--------------");
        String i;
        c.print("Type in the name you want to add: ");
        i = c.readLine();

        list = add(list, i);

        c.println("--------------");
        print(list);

        c.println("\nPress any key to continue.");

        c.readChar();

        return list;
    }

    public static String[] program5(String[] list) throws IOException
    {
        c.clear();
        c.readChar();
        c.println("Remove names");
        c.println ("--------------");
        int i;
        c.print("Type in the position you want to remove: ");
        i = c.readInt();

        list = remove(list, i);

        c.println("--------------");
        print(list);

        c.println("\nPress any key to continue.");

        c.readChar();

        return list;
    }

    public static String[] program6(String[] list) throws IOException
    {
        c.clear();
        c.readChar();
        c.println("Sort names alphabetically");
        c.println ("--------------");

        sort(list);
        print(list);

        c.println("\nPress any key to continue.");

        c.readChar();

        return list;
    }

    public static String[] program7(String[] list) throws IOException
    {
        c.clear();
        c.readChar();
        c.println("Print array");
        c.println ("--------------");
        print(list);

        c.println("\nPress any key to continue.");

        c.readChar();

        return list;
    }

    public static void main (String[] args) throws IOException
    {
        c = new Console ();

        String[] list = new String[10];



        char choice;
        do {
            c.clear();
            c.println("\n\n\nArray Problem Set");
            c.println ("--------------");
            c.println ("1. Read names from file");
            c.println ("2. Input names from keyboard");
            c.println ("3. Search array for name(s)");
            c.println ("4. Add names");
            c.println ("5. Remove names");
            c.println ("6. Sort names alphabetically");
            c.println ("7. Print array");
            c.println ("0. Quit");
            choice = c.readChar();

            if (choice == '1')
                list = program1(list);
            else if (choice == '2')
                list = program2(list);
            else if (choice == '3')
                list = program3(list);
            else if (choice == '4')
               list = program4(list);
            else if (choice == '5')
                list = program5(list);
            else if (choice == '6')
                list = program6(list);
            else if (choice == '7')
                list = program7(list);

        }
        while (choice != '0'); //exit when 0




    }

}
