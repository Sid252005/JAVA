import java.util.Scanner;

public class CreditLimitCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
         System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter beginning balance: ");
        int beginningBalance = sc.nextInt();

        System.out.print("Enter total charges this month: ");
        int charges = sc.nextInt();

        System.out.print("Enter total credits this month: ");
        int credits = sc.nextInt();

        System.out.print("Enter allowed credit limit: ");
        int creditLimit = sc.nextInt();

      
        int newBalance = beginningBalance + charges - credits;

      
        System.out.println("New balance is: " + newBalance);

       
        if (newBalance > creditLimit) {
            System.out.println("Credit limit exceeded");
        } else {
            System.out.println("Credit limit not exceeded");
        }

        sc.close();
    }
}
