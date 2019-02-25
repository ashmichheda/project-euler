package com.prog.ProjectEulerPrograms;

public class Problem02 {

	public static void main(String[] args) {
		
		int m = 1, n = 2, p = 0, sum = 2;
		
		while(p < 4000000) {
			
			p = m + n;
			m = n;
			n = p;
			if(p % 2 == 0)
				sum += p;			
		}
		System.out.println((sum)+" is the answer");
	}
}
