/*
 Starting in the top left corner of a 2×2 grid, 
 and only being able to move to the right and down, 
 there are exactly 6 routes to the bottom right corner.
 
 How many such routes are there through a 20×20 grid?
 
 A simple combinatorics problem whose visual explanation is given in the comments section 
 for better understanding.
*/

package com.prog.ProjectEulerPrograms;
import java.math.BigDecimal;

public class Problem15 {

	public static void main(String[] args) {
		
		int numberOfMoves = 40; // 20x20 so 20 + 20 = 40
		int numberOfRightMoves = 20;
		
		System.out.println("No. of routes are: "+factorial(numberOfMoves).divide(factorial(numberOfRightMoves).multiply(factorial(numberOfMoves - numberOfRightMoves))));
	}

	private static BigDecimal factorial(int n) {

		BigDecimal answer = BigDecimal.ONE;
		
		for(int i = 1; i<=n; i++) {
			answer = answer.multiply(BigDecimal.valueOf(i));
		}
		
		return answer;
	}
}
