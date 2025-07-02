import java.util.Scanner;

public class Wrapperclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc= new Scanner(System.in);
     
     System.out.print("Enter Number: ");
     int number= sc.nextInt();
     
     System.out.println("Given Number:"+number);
     System.out.println("Binary equivalent:"+Integer.toBinaryString(number));
     System.out.println("Octal equivalent:"+Integer.toOctalString(number));
     System.out.println("Hexadecimal equivalent:"+Integer.toHexString(number));
    	 
     
	}

}
