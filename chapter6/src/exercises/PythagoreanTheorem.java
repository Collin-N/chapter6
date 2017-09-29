package exercises;

import java.util.Scanner;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		
		double sideA, sideB, sideC;
		String stop = " ";
		Scanner input = new Scanner(System.in);
		String chooseSideString = null;
		while(stop != "stop") {
			
		
		System.out.println("Trying to solve a right triangle? \nPlease enter which side you are solving for >> A\nB\nC");
		chooseSideString = input.nextLine();
		if(chooseSideString.equalsIgnoreCase("A"));
		{
			System.out.println("Please enter side B");
			sideB = input.nextDouble();
			System.out.println("please enter side C");
			sideC = input.nextDouble();
			sideA = Math.sqrt(sideC) - Math.sqrt(sideB);
			
			System.out.println("Side A is " + sideA);
			
			
		}
		if(chooseSideString.equalsIgnoreCase("B"));
		{
			System.out.println("Please enter side A");
			sideB = input.nextDouble();
			System.out.println("please enter side C");
			sideC = input.nextDouble();
			sideA = Math.sqrt(sideA) - Math.sqrt(sideC);
			
			System.out.println("Side B is " + sideB);
			
			
		}
		if(chooseSideString.equalsIgnoreCase("C"));
		{
			System.out.println("Please enter side A");
			sideB = input.nextDouble();
			System.out.println("please enter side B");
			sideC = input.nextDouble();
			sideA = Math.sqrt(sideA) - Math.sqrt(sideB);
			
			System.out.println("Side C is " + sideC);
			
			
		  }
			System.out.println("would you like to stop? input stop to stop, input no to continue > ");
			stop = input.nextLine();
		}
	}

}
