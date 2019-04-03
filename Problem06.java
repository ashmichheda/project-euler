
//Find the difference between the sum of the squares of the first one hundred natural numbers 
// and the square of the sum.
package com.prog.ProjectEulerPrograms;

public class Problem06 {

	public static void main(String[] args) {

		int n = 100;
		int sumOfSquareOf100 = (n * (n +1) * (2*n + 1)) / 6;
		int squareOfSumOf100 = (n * (n + 1)/2) * (n * (n + 1)/2);
		
		int result = sumOfSquareOf100 - squareOfSumOf100;
		System.out.println("Answer is: "+Math.abs(result));
	}

}
