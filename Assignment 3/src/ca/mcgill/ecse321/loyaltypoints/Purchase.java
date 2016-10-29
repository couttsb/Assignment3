package ca.mcgill.ecse321.loyaltypoints;

import java.util.Date;
import java.util.Scanner;

public class Purchase {
	
	// This class will take a user input of shopper name and total grocery price and return the values as an array of objects. These different 
	// variable types are combined together to limit the number of scanners in the program to one. Since the types of the input values must be 
	// different, the array is initialized to contain objects. These objects are converted to their proper type in StrategyPatternDemo.java
	public static Object[] PurchaseAttributes() {
		String name;
		double price;
		Object[] array;
		
		try(Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the Customer's Name: ");
			name = input.next();
			
			System.out.println("Enter the Total Price of the Groceries: ");
			price = input.nextDouble(); 
			while (price <= 0) {
				System.out.println("Price Must be Greater than 0! ");
				price = input.nextDouble(); 
			}
		}
		array = new Object[]{name, price};
		return array;
	}
	
	public static Date Date() {
		Date date = new Date();
		return date;
	}
	
	private PointsStrategy strategy;
	
	public Purchase(PointsStrategy strategy) {
		this.strategy = strategy;
	}
	
	public int executeStrategy(double price) {
		return (int) strategy.getPoints(price);
	}
}