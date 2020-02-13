package Chp5;

import java.util.Scanner;

public class E54 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("x =");
		int x = sc.nextInt();
		System.out.println("y =");
		int y = sc.nextInt();
		System.out.println("z =");
		int z = sc.nextInt();
		if (x==y && y==z)
			System.out.println("all same");
		else if (x!= y && y!=z && x!=z)
			System.out.println("all are different");
		else 
			System.out.println("Neither");
	}

}
