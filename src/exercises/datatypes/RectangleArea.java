package exercises.datatypes;
import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float length;
        float width;
        float area;

        System.out.println("Please enter the rectangle's length: ");
        length = input.nextFloat();
        System.out.println("Now please enter the rectangle's width");
        width = input.nextFloat();
        input.close();

        area = length * width;

        System.out.print("Your rectangle's area is " + area);

    }
}
