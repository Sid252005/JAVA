import java.util.Scanner;
public final class ScannerDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner (System.in);
      
      System.out.print("Enter first number:");
      if(!sc.hasNextDouble()) {
    	  System.out.println("Error:First input is not a double!");
    	  return;
      }
      double num1=sc.nextDouble();
      System.out.print("Enter second number:");
      if(!sc.hasNextDouble()) {
    	  System.out.println("Error: second input is not double!");
    	  return;
      }
      double num2=sc.nextDouble();
      
      double average=(num1+num2)/2;
      System.out.println("Average:"+average);
      
      sc.close(); 
      //java takes integers as double(datatype) 
	}

}
                                                                                                                                                                                                                                                                                             