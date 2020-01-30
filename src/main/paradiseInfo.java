package main;
//Author Deondra
//Date: 1/23/2020

import java.util.Scanner;

public class paradiseInfo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	double price;
	double discount;
	double savings;
	Scanner input = new Scanner(System.in);
	System.out.print("Enter cutoff price for discount >>>");
	price = input.nextDouble();
	
	System.out.print("Enter discount rate as a whole number>>>")
	discount = input.nextDouble();
	
	displayInfo();
	
	savings = computeDiscountInfo(price, discount);
	System.out.printIn("Special this week on any service over" + price);
	System.out.print("Thats a savings pf at least $" +savings);
}
		
		System.out.print("Discount of " + discount + "Percent")
		System.out.print();
}

	System.out.print("Paradise Day Spa wants to pamper you.")
	System.out.print("We will make you look good.");
	}
	public static double computeDiscountInfo(double pr, double dscnt)
	{
		double savings;
		savings = pr * dscnt/100;
		return savings;
	}	
