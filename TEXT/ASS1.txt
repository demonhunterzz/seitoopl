
package Ass1;

import java.util.*;
//here we import the class scanner in file util for the input stream
public class Constructor {

	public static void main(String[] args) {
		Complex res = new Complex();
		// we create our first object for the given example named as res
		int ch;
		// to get the choice we declared the integer
		float real,imag;
		Scanner input = new Scanner(System.in);
		//created the input object to get the input from users
		
		
		//First complex number
		System.out.println("Enter the first complex number: ");
		real=input.nextFloat();  //Read real part.
		imag=input.nextFloat();  //Read imaginary part.
		
		//putting first inputs into newly created class object c1 for the opretions
		
		Complex c1 = new Complex(real,imag);
		System.out.println("("+c1.realp+") + ("+c1.imagp+")i");
		
		//Second complex number
		System.out.println("Enter the second complex number: ");
		real=input.nextFloat();  //Read real part.
		imag=input.nextFloat();  //Read imaginary part.
		
		Complex c2 = new Complex(real,imag);
		System.out.println("("+c2.realp+") + ("+c2.imagp+")i");
		
		do 
		{
		//Display MENU.
		System.out.println("\nSelect operation to be done: ");
		System.out.println("\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\n5.Exit");
		ch=input.nextInt();
		
		switch (ch)
		{
		case 1: res.add(c1, c2); //Addition function.
			    break;
		case 2: res.sub(c1, c2); //Subtraction function.
			    break;
		case 3: res.mul(c1, c2); //Multiplication function.
			    break;
		case 4: res.div(c1, c2); //Division function.
			    break;
		case 5: System.out.println("You have succesfully exited.");
		        break;
		default: System.out.println("Enter appropriate choice.");
		}
		}while (ch!=5);
	}
}

//----------Complex Class----------
class Complex
{
	//Add constructor.
	
	// declared the two complex construtor for the operations
	
	Complex()
	{
		realp=0.0f;
		imagp=0.0f;
	}
	
	Complex(float real,float imag)
	{
		realp=real;
		imagp=imag;
	}
	// as this variables are public we can accese this out of the class and able to do show what is output
	
	//Add instance variables.
	public float realp;
	public float imagp;
	//Add methods.
	
	//first method for addition and work on it
	// we put two argument in it two complex number object and its 4 value one real and imag
	
	public void add(Complex c1,Complex c2)
	{
		this.realp=c1.realp+c2.realp;
		this.imagp=c1.imagp+c2.imagp;
		
		//Display resultant.
		System.out.println("Sum is "+"("+this.realp+") + ("+this.imagp+")i");
	}

	public void sub(Complex c1,Complex c2)
	{
		float real,imag;
		real=c1.realp-c2.realp;
		imag=c1.imagp-c2.imagp;
		
		//Display resultant.
		System.out.println("Difference is "+"("+real+") + ("+imag+")i");
	}
	
	public void mul(Complex c1,Complex c2)
	{
		float real,imag;
		real=(c1.realp*c2.realp)-(c1.imagp*c2.imagp);
		imag=(c1.realp*c2.imagp)+(c1.imagp*c2.realp);
		
		//Display resultant
		System.out.println("Product is "+"("+real+") + ("+imag+")i");
	}
	
	public void div(Complex c1,Complex c2)
	{
		float real1, real2, imag1, imag2, real, imag;
		real1=(c1.realp*c2.realp)+(c1.imagp*c2.imagp);
		real2=(c2.realp*c2.realp)+(c2.imagp*c2.imagp);
	    imag1=(c1.imagp*c2.realp)-(c1.realp*c2.imagp);
	    imag2=real2;
	    
	    real=real1/real2;
	    imag=imag1/imag2;
	    
	    //Display resultant
	    System.out.println("Division is "+"("+real+") + ("+imag+")i");
	}
}
