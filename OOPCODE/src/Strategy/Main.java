package Strategy;

import java.util.Scanner;
public class Main{

	public static void main(String[] args) {

		ShoppingCart cart = new ShoppingCart();
		
		Scanner ip=new Scanner(System.in);
		Item item1 = new Item("1234",60);
		Item item2 = new Item("5678",40);
		int pmode;
		cart.addItem(item1);
		cart.addItem(item2);
		System.out.println("Pay using 1.paypal Ac\n2.Creditcard");
		System.out.println("Select payment mode..");
		pmode=ip.nextInt();
				
		if(pmode==1)
		//pay by paypal
		cart.pay(new PaypalStrategy("myemail@example.com", "pwd"));
		else
		//pay by credit card
		cart.pay(new CreditCardStrategy("Aparna Bindage", "1234567890123456", "786", "12/15"));
	}

}

