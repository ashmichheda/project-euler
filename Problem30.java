//Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

package com.prog.ProjectEulerPrograms;

public class Problem30 {

	public static void main(String[] args) {


		int i, j, sum = 0, temp, answer = 0;
		// start time
		long start = System.currentTimeMillis();
		for(i = 2; i<999999; i++) {
			
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
