 //Import the Scanner class
import java.util.Scanner; 

public class wk9ex2
{
    public static void main(String[] args)
    {
        //Create a Scanner object.
        Scanner myObj = new Scanner(System.in); 
        //Program Title.
        System.out.println("AREA CALCULATOR APP");
        //Ask the user to enter the length of the rectangle.
        System.out.print("Enter the length of the rectangle: ");
        //Declare a variable to store the user input and store the user input in the variable.
        String input = myObj.nextLine(); 
        //Convert the user input to a double.
        double length = Double.parseDouble(input);
        //Ask the user to enter the width of the rectangle.
        System.out.print("Enter the width of the rectangle: ");
        //Declare a variable to store the user input and store the user input in the variable.
        input = myObj.nextLine();
        //Convert the user input to a double.
        double width = Double.parseDouble(input);
        //Formula to calculate the area of the rectangle.
        double area = length * width;
        //Formula to calculate the perimeter of the rectangle.
        double perimeter = 2 * (length + width);
        //Display the results.
        System.out.println("Results:");
        System.out.println("Area of the rectangle: " + String.format("%.0f", area));
        System.out.println("Perimeter of the rectangle: " + String.format("%.0f", perimeter));

        //Close the Scanner object.
        myObj.close();
        //End of program message.
        System.out.println("\nEnd of program!\n");

        //Pushed to GitHub Wk9ex2 Repository.
    }
}