package main;

import java.util.Scanner;

public class CreateSpaServices {

	public static void main(String[] args)
	{
		String Service;
		double price;
		String getString = null;
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner input = new Scanner(System.in);
	
		
		pL("Enter service>>");
		Service = input.nextLine();
		pL("Enter price>>");
		Price = input.nextDouble();
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		
		input.nextLine();
		pL("Enter service>>");
		Service = input.nextLine();
		pL("Enter price>>");
		Price = input.nextDouble();
		
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		
		pL("First service details:");
		pL(firstService.getServiceDescription() + " $" + secondService.getPrice());
	}
	public static void pl(String getString)
	{
		System.out.printIn(getString);
	}
	
}
