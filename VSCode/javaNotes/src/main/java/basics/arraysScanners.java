package basics;

//this is an import statement
import java.util.ArrayList;
import java.util.Scanner;

/*these are the basics; i.e. data types, loops, arrays, ect.
this whole thing is a multi line comment
this is a class *insert down arrow here**/
public class arraysScanners {

    /*this is a private array called tools that holds strings.
    you can't change the size of an array once it's instantiated
    Modifier DataType Name               Data                  */
    private String[] tools = {"Bucket", "Brush", "Ladder"};
    /*You can make a dynamic array with ArrayLists like this:

                                                   instantiates a new
      Data type that said object holds | arraylist object that holds strings*/
    private ArrayList<String> paintColors = new ArrayList<String>();

    /*accept user input with a scanner object*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
    }
}
