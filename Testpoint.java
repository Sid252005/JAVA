package Tester;

import java.util.Scanner;
import com.app.geometry.Point2D;

public class Testpoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter x1 and y1 coordinates for Point 1:  ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        
        System.out.print("Enter x2 and y2 coordinates for Point 2:  ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        
        Point2D p1 = new Point2D(x1, y1);
        Point2D p2 = new Point2D(x2, y2);

       
        System.out.println("Point 1 is at: " + p1.getDetails());
        System.out.println("Point 2 is at: " + p2.getDetails());

       
        if (p1.isEqual(p2)) {
            System.out.println("Both points are at the same location.");
        } else {
            System.out.println("Points are at different locations.");
           
            double distance = p1.calculateDistance(p2);
            System.out.println("Distance between Point 1 and Point 2 is: " + distance);
        }

        sc.close();
    }
}
