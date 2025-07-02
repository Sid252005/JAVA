package tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class TestPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for first point
        System.out.print("Enter x and y coordinates for Point 1: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        // Taking input for second point
        System.out.print("Enter x and y coordinates for Point 2: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        // Creating two Point2D objects
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

        // Display point details
        System.out.println("Point 1 is at: " + p1.getDetails());
        System.out.println("Point 2 is at: " + p2.getDetails());

        // Check if both points are equal
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same location.");
        } else {
            System.out.println("Points are at different locations.");
            // Calculate and display distance
            double distance = p1.calculateDistance(p2);
            System.out.println("Distance between Point 1 and Point 2 is: " + distance);
        }

        sc.close();
    }
}
