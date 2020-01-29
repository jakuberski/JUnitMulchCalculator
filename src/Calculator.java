import java.util.Scanner;

import model.MulchCalculator;
import model.RockCalculator;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter how much square feet you have.");
		
		int areaInFeet = in.nextInt();

		RockCalculator area = new RockCalculator();
		
		area.rockMath(areaInFeet);
		
		System.out.println(area.toString());
		
		MulchCalculator coverage = new MulchCalculator();
		
		coverage.mulchMath(areaInFeet);
		
		System.out.println(coverage.toString());
		
		
		
		
		
	

	}

}
