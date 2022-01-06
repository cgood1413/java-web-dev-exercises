package exercises.datatypes;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name;

        System.out.println("Hello, what is your name?: ");
        name = input.nextLine();
        System.out.println("Hello, " + name);
    }
}
