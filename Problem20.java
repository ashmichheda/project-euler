//Find the sum of the digits in the number 100!

package com.prog.ProjectEulerPrograms;

import java.math.BigDecimal;

public class Problem20 {

	public static void main(String[] args) {
		
		int factorial = 100;
		BigDecimal fact = findFactorial(factorial);
		long result = findSumOfFact(fact);
		System.out.println("Sum of the digits of 100! is: "+result);
	}

	private static long findSumOfFact(BigDecimal fact) {
		
		String input = ""+fact;
		long sum = 0;
		for(int i = 0; i<input.length(); i++)
			sum += Character.getNumericValue(input.charAt(i));
		return sum;
	}

	private static BigDecimal findFactorial(int factorial) {
		
		BigDecimal ans = BigDecimal.ONE;
		for(int i = factorial; i>=2; i--) {
			ans = ans.multiply(BigDecimal.valueOf(i));
		}
		
		return ans;
	}

}
