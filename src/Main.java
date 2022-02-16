import java.util.Scanner;
public class Main
{

    public static void main(String[] args)
    {
	Scanner in = new Scanner (System.in);

    String trash = "";

    double meters = 0;
    double miles = 0;
    double feet = 0;
    double inches = 0;

    System.out.print("Please insert your measurement in meters: ");

    if (in.hasNextDouble())
    {
        meters = in.nextDouble();
        in.nextLine();

        System.out.println("You inserted " + meters + " meters");
    }
    else
    {
        trash = in.nextLine();
        System.out.println("Illegal number: " + trash);
        System.out.println("Exiting...run the program again!");
        System.exit(0);
    }

    miles = meters * 0.000621;
    feet = meters * 3.28084;
    inches = meters * 39.37;

    System.out.println("Converting from " + meters + " meters \nto feet is: " + feet + "\nto miles is: " + miles + "\nto inches is: " + inches);


    }
}
