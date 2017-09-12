package YouDoIt;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ParadiseInfo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double price;
		double discount;
		double savings;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter cutoff price for discount >> ");
		price = keyboard.nextDouble();
		System.out.print("Enter a discount rate as a whole number >> ");
		discount = keyboard.nextDouble();
		savings = computeDiscountInfo(price, discount);
		
		System.out.println("Special this week on any service over " + price);
		System.out.println("Discount of " + discount + " percent");
		System.out.println("That's a savings of at least $" + savings);
		
	}

	private static double computeDiscountInfo(double price, double discount) {
		// TODO Auto-generated method stub
		double savings;
		savings = price * discount / 100;
		return savings;
	}

}
