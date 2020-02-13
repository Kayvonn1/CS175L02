package Part1;

import java.util.Scanner;

public class CarDecision {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the cost of the regular car : ");
		
		double Car = in.nextDouble(); 
		
		System.out.println("Enter the miles per gallon of the regular car : ");
		
		double mpgCar = in.nextDouble();
		
		System.out.println("Enter the cost of the hybrid car : ");
		
		double hybrid = in.nextDouble();
		
		System.out.println("Enter the miles per gallon of the hybrid car : ");
		
		double mpgHybrid = in.nextDouble();
		
		System.out.println("Enter the cost of gas : ");
		
		double gas = in.nextDouble();
		
		System.out.println("Enter the number of miles traveled in one year : ");
		
		double Travel = in.nextDouble();
		
		double hybridCost = hybrid + (Travel/mpgHybrid) * (gas); 
		
		double carCost = Car + (Travel/mpgHybrid) * (gas); 
		
		int year = 1;
		
	for (int a=0; a<5; a++)
	{	
		if (hybridCost < carCost) {
			
			System.out.println("The cost after " + year + ( " years is Regular Car:" + carCost + (". Hybrid Car" + hybridCost)));
			
			System.out.println("The car pays back after " + year + " years");
		}
		else 
		{
			
			System.out.println("The cost after " + year + (" years is Regular Car:" + carCost + (". Hybrid Car: " + hybridCost)));
			
			System.out.println("The hybrid car pays back after " + year + " years");
		}
	
	}	
		
		
	}

}