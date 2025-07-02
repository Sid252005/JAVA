import java.util.Scanner;

public class Calculatorapp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         
        System.out.print("Enter total miles driven per day: ");
        double milesDriven = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: ");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: ");
        double parkingFees = scanner.nextDouble();
         
        System.out.print("Enter tolls per day: ");
        double tolls = scanner.nextDouble();

        double gallonsUsed = milesDriven / milesPerGallon;

        double gasCost = gallonsUsed * costPerGallon;
 
        double totalCost = gasCost + parkingFees + tolls;
           
        System.out.println("Your daily driving cost is: " + totalCost);
        
        
          
        scanner.close();
    }
}
