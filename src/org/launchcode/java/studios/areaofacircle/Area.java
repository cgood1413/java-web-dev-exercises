package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double pi = 3.14;
        double radius;
        double area;

        System.out.println("Please enter the radius of your circle: ");
        radius = input.nextDouble();
        input.close();

        area = Circle.getArea(radius);
        System.out.println("The radius of your circle is " + area);

    }
}
