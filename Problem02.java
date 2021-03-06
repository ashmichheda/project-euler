//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
package com.prog.ProjectEulerPrograms;

public class Problem02 {

	public static void main(String[] args) {
		
		int m = 1, n = 2, p = 0, sum = 2;
		int val = 4000000;
		while(p < val) {
			
			p = m + n;
			m = n;
			n = p;
			if(p % 2 == 0)
				sum += p;			
		}
		System.out.println((sum)+" is the answer");
	}
}
