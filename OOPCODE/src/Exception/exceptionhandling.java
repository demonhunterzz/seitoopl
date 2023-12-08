
package Exception;

import java.util.Scanner;

public class exceptionhandling {
	
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		int num1, num2, result;
		try {
			System.out.println("Enter first no\n");
			num1 = s.nextInt();
			System.out.println("Enter second no\n");
			num2 = s.nextInt();
			result=num1/num2;
			System.out.println("Division=" + result);
			
			int X[]=new int[10];
			X[15]=15;	
		}
	catch( NumberFormatException e) {
		System.out.println("Wrong input\n");
		//except the valid input
	}
	catch( ArithmeticException e) {
		System.out.println("Denominator is ZERO\n Re Enter num2");
		     num2 = s.nextInt();
	}
	catch( ArrayIndexOutOfBoundsException e) {
		System.out.println("Array index is greater than 9\n");
	}
	catch(Exception e) {
		System.out.println("Anexception other than listed is 0");
	}
   finally
   {
	   s.close();
   }

	}
}
