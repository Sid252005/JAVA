package Tester;

import com.app.geometry.Point2D;
import java.util.Scanner;

public class TestPointArray1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Ask how many points
        System.out.print("How many points do you want to plot? ");
        int size = sc.nextInt();

        // Step 2: Create array
        Point2D[] points = new Point2D[size];

        // Step 3: Input each point
        for (int i = 0; i < size; i++) {
            System.out.print("Enter x and y for point " + i + ": ");
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            points[i] = new Point2D(x, y);
        }

        // Step 4: Menu loop
        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Display a specific point");
            System.out.println("2. Display all points");
            System.out.println("3. Display distance between two points");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter index of the point: ");
                    int index = sc.nextInt();
                    if (index >= 0 && index < points.length) {
                        System.out.println("Point[" + index + "] = (" + points[index].getX() + ", " + points[index].getY() + ")");
                    } else {
                        System.out.println("Invalid index, pls retry!!!!");
                    }
                    break;

                case 2:
                    System.out.println("All Points:");
                    for (int i = 0; i < points.length; i++) {
                        System.out.println("Point[" + i + "] = (" + points[i].getX() + ", " + points[i].getY() + ")");
                    }
                    break;

                case 3:
                    System.out.print("Enter index of start point: ");
                    int idx1 = sc.nextInt();
                    System.out.print("Enter index of end point: ");
                    int idx2 = sc.nextInt();
                    if (idx1 >= 0 && idx1 < points.length && idx2 >= 0 && idx2 < points.length) {
                        if (!points[idx1].isEqual(points[idx2])) {
                            double distance = points[idx1].calculateDistance(points[idx2]);
                            System.out.println("Distance between Point[" + idx1 + "] and Point[" + idx2 + "] = " + distance);
                        } else {
                            System.out.println("Both points are at the same location.");
                        }
                    } else {
                        System.out.println("Invalid indices. Try again.");
                    }
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}
