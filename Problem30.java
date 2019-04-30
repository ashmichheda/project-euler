//Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

/* Straight forward problem, but trick here is to find an upper bound.
 Say 9^5 + 9^5 + 9^5 + 9^5 + 9^5 = 295245, say multiplying it 6 times 6*9^5 = 354294, 
 to round up 355000 can be considered an upper bound */
 
package com.prog.ProjectEulerPrograms;

public class Problem30 {

	public static void main(String[] args) {


		int i, j, sum = 0, temp, answer = 0;
		// start time
		long start = System.currentTimeMillis();
		for(i = 2; i<355000; i++) {
			
			temp = i;
			
			while(temp != 0) {
				j = temp%10;	// for getting each digit of the number
				sum += Math.pow(j, 5);
				temp = temp/10;
			}
			if(sum == i) {
				System.out.println(i);
				answer += i;
			}
			sum = 0;
		}
		long end = System.currentTimeMillis();
		System.out.println("Answer is: "+answer);
		System.out.println("Execution time in milliseconds: "+(end - start)+" ms");
	}

}
