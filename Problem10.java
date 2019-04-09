
// Find the sum of all the primes below two million.
package com.prog.ProjectEulerPrograms;

public class Problem10 {

	public static void main(String[] args) {
		
		long count = 0, sum = 0, number;
		
		for(number = 1; number<2000000; number++) {
			count = 0;
			for(int j = 2; j<= Math.sqrt(number); j++) {
				
				if(number % j == 0) {
					count++;
					break;
				}
			}
			if(count == 0 && number!= 1)
				sum += number;
			
		}
		System.out.println("sum of all the primes below two million: "+sum);
	}

}
