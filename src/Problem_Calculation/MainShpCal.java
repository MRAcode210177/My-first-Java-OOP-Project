package Problem_Calculation;

import java.util.ArrayList;

public class MainShpCal {
    public static void main(String[] args){
        // Create an ArrayList of the base type (Shape)
        ArrayList<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Circle(2.5));

        System.out.println("--- Demonstrating Polymorphism ---");

        // Loop through the base type (Shape)
        for (Shape shape : shapes) {
            // Java automatically calls the correct subclass method (runtime polymorphism)
            shape.displayInfo();
            System.out.printf("Area: %.2f\n", shape.calculateArea());
            System.out.println("--------------------------------");
        }
    }
}
