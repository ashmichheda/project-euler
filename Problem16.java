/*
215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
 
 */

package com.prog.ProjectEulerPrograms;

import java.math.BigDecimal;

public class Problem16 {

	public static void main(String[] args) {
		
		BigDecimal value = new BigDecimal(2);
		value = value.pow(1000);
		String input = ""+value;
		int result  = 0;
		for(int i = 0; i<input.length(); i++)
			result += Character.getNumericValue(input.charAt(i));
		
		System.out.println("Answer is: "+result);
	}

}
