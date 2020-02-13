package Chp5;

import java.util.Scanner; 

public class chp51 {
	public static void main (String[]args) {
	
		System.out.println("Floor: ");
		Scanner sc= new Scanner(System.in);
		
		int floor = sc.nextInt();
		
		if (floor>13)
		{
		int actualFloor = floor - 1; 
		}
		else
		{ 
			int actualFloor = floor;
		}
	}
}

