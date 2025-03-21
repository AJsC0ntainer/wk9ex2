import java.util.Scanner;  // Import the Scanner class

public class wk9ex2
{
    public static void main(String[] args)
    {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object

        System.out.println("AREA CALCULATOR APP");

        System.out.print("Enter the length of the rectangle: ");
        String input = myObj.nextLine();  // Read user input
        double length = Double.parseDouble(input);

        System.out.print("Enter the width of the rectangle: ");
        input = myObj.nextLine();  // Read user input
        double width = Double.parseDouble(input);

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Results:");
        System.out.println("Area of the rectangle: " + String.format("%.0f", area));
        System.out.println("Perimeter of the rectangle: " + String.format("%.0f", perimeter));

        myObj.close();

        System.out.println("\nEnd of program!\n");
    }
}