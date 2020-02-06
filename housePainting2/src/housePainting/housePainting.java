package housePainting;
import java.util.Scanner;

public class housePainting {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		
		//Housebbb
		System.out.println("Enter width of the house");
		int houseWidth = scan.nextInt();
		System.out.print("Enter length of the house ");
		int houseLength = scan.nextInt(); 
		System.out.println("Enter house Height");
		int houseHeight = scan.nextInt();
		
		//Windows 
		System.out.println("Enter length of window");
		int windowLength = scan.nextInt();
		System.out.println("Enter Width of window");
		int windowWidth = scan.nextInt();
		System.out.println("Enter Number of windows");
		int windowNumber = scan.nextInt();
		
		//Doors 
		System.out.println("Enter length of door");
		int doorLength = scan.nextInt();
		System.out.println("Enter Width of door");
		int doorWidth = scan.nextInt();
		System.out.println("Enter amount of doors");
		int doorAmount = scan.nextInt();
		
		// Paint
		System.out.println("Enter cost to paint per square feet");
		double costPerSqFT = scan.nextInt(); 
		
		//Perform Computations  
		int houseBase = houseLength*houseWidth;
		double housePeak = houseLength * houseWidth + (.5 * (houseLength * (houseHeight - houseWidth)));
		double houseSqFT = 2 * housePeak + 2 * houseBase;
		
		int windowSqFT = windowNumber * (windowLength * windowWidth);
		
		int doorSqFT = doorAmount * (doorLength * doorWidth);
		
		double totalHouseSqFT = houseSqFT - (windowSqFT * doorSqFT);
		
		double costOfPaint = costPerSqFT * totalHouseSqFT; 
		
		//Print the result
		System.out.println("The square footage is: " + totalHouseSqFT);
		System.out.println("The total price for the paint job is" + costOfPaint);
	}
}
