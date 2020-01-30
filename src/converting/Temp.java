package converting;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double convertF;
		double celsiusEntry;
		GetStuff celsiusNum1 = new GetStuff();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in celsius >>> ");
		celsiusEntry = input.nextDouble();
		
		convertF = convertFahrenheit(celsiusEntry);
		System.out.println("The temperature in fahrenheit is " + convertF);
		System.out.println("The temperature in fahrenheit is " + convertF);
		
		System.out.println(celsiusNum1.getCelsiusTemp() + " celsius");
		
	}
	public static double convertFahrenheit(double c) {
		double convertF;
		convertF = c * (9/5) + 32;
		return convertF;
	}
}

