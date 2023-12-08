
package Ass4;

import java.util.*;
public class Abstract{
	
	public static void main(String[] args) {
		int ch;
		Scanner input = new Scanner(System.in);
		
		do
		{
			//Display MENU.
			System.out.println("\nSelect the shape you want to access: ");
			System.out.println("1.Triangle\n2.Rectangle\n3.Exit");
		 	ch = input.nextInt(); 
			
			switch (ch)
			{
			case 1: Shape t1 = new Triangle();
					t1.setData();
					t1.compute_area();
					break;
			case 2: Shape r1 = new Rectangle();
			        r1.setData();
			        r1.compute_area();
			        break;
			case 3: System.out.println("You have successfully exited.");
			        break;
			default: System.out.println("Enter appropriate choice.");
			}
		}while (ch!=3);
	}
}

//-----Shape Class-----
abstract class Shape
{
	Scanner input = new Scanner(System.in);
	
	//Variables
	double val1,val2;
	
	public void setData()
	{
		System.out.println("Enter the first dimension: ");
		double len = input.nextDouble();
		val1=len;
		
		System.out.println("\nEnter the second dimension: ");
		double wid = input.nextDouble();
		val2 = wid;
	}

	abstract public void compute_area();
}

//-----Triangle Class-----
class Triangle extends Shape
{
	public void compute_area()
	{
		double area = 0.5*val1*val2;
		System.out.println("\nThe area of the triangle is "+area+" sq. units.");
	}
}

//-----Rectangle Class-----
class Rectangle extends Shape
{
	public void compute_area()
	{
		double area = val1*val2;
		System.out.println("\nThe area of the triangle is "+area+" sq. units.");
	}
}
