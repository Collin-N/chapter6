package exercises;

import java.util.Scanner;

public class PythagoreanTheorem {

	public static void main(String[] args) {
		
		double sideA, sideB, sideC;
		String stop = " ";
		Scanner input = new Scanner(System.in);
		String chooseSideString = null;
		double Area;
		double Perimeter;
		boolean condition = true;
		while(condition) {
			
		
		System.out.println("Trying to solve a right triangle? \nPlease enter which side you are solving for >> \nA\nB\nC");
		chooseSideString = input.nextLine();
		
		if(chooseSideString.equalsIgnoreCase("A"))
		{
			System.out.println("Please enter side B");
			sideB = input.nextDouble();
			System.out.println("please enter side C");
			sideC = input.nextDouble();
			sideA = (sideB * sideB) + (sideC * sideC);
			
			sideA = Math.sqrt(sideA);
			Area =  0.5 * sideB * sideC;
			Perimeter = sideC + sideB + sideA;
			System.out.println("Side c is " + sideC + " The perimeter is " + Perimeter + "the area is " + Area);
		
		}
		if(chooseSideString.equalsIgnoreCase("B"))
		{
			System.out.println("Please enter side A");
			sideA = input.nextDouble();
			System.out.println("please enter side C");
			sideC = input.nextDouble();
			sideB = (sideA * sideA) + (sideC * sideC);
			
			sideB = Math.sqrt(sideB);
			Area =  0.5 * sideA * sideC;
			Perimeter = sideC + sideB + sideA;
			System.out.println("Side b is " + sideB + " The perimeter is " + Perimeter + "the area is " + Area);
			
			
		}
		if(chooseSideString.equalsIgnoreCase("C"))
		
		{
			System.out.println("Please enter side A");
			sideA = input.nextDouble();
			System.out.println("please enter side B");
			sideB = input.nextDouble();
			sideC = (sideA * sideA) + (sideB * sideB);
			
			sideC = Math.sqrt(sideC);
			Area =  0.5 * sideA * sideB;
			Perimeter = sideC + sideB + sideA;
			System.out.println("Side c is " + sideC + " The perimeter is " + Perimeter + "the area is " + Area);
			
		  }
		
		
			System.out.println("would you like to stop? input stop to stop, input no to continue > ");
			stop = input.nextLine();
			if("stop".equalsIgnoreCase(stop)) 
				condition = false;
			else
				condition = true;
			
		}
	}

}
