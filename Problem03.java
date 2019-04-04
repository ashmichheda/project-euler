//What is the largest prime factor of the number 600851475143?
package com.prog.ProjectEulerPrograms;

public class Problem03 {

	public static void main(String[] args) {
		
		long i = 2, largestPrimeNum, val = 600851475143L;
		while(i < val) {
			if(val % i == 0)
				val = val/i;
			else
				i++;
		}
		largestPrimeNum = val;
		System.out.println(largestPrimeNum +" is the largest prime factor of: "+val);
	}

}
