package exercises.datatypes;
import java.util.Scanner;

public class MilesPerGallon {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float miles;
        float gallons;
        float milesPerGallon;

        System.out.println("Please enter the number of miles driven: ");
        miles = input.nextFloat();
        System.out.println("Now please enter the number of gallons used: ");
        gallons = input.nextFloat();
        input.close();

        milesPerGallon = miles / gallons;
        System.out.println("Your trip took " + milesPerGallon + " miles per gallon.");

    }
}
