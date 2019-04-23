package com.prog.ProjectEulerPrograms;

public class Problem23 {

	public static void main(String[] args) {
		
		
		int i = 1, j = 1, sum = 0;
		boolean isAbundant = false;
		
		for(i = 1; i<=20161 ; i++) {
			
			for(j = 1; j<i && isAbundant == false; j++) {
					if(isAbundant(j)) {
						if(isAbundant(i-j)) {
							isAbundant = true;
						}
					}
				
			}
			if(isAbundant == false)
				sum += i;
			isAbundant = false;
		}
		System.out.println(sum+" is the answer!");
	}

	private static boolean isAbundant(int num) {

		int i, sum = 0;
		boolean result = false;
		for(i = 1; i<=Math.sqrt(num); i++) {
			if(num%i == 0) {
				
				// if divisors are equal,
				// take only one of them
				if(num / i == i)
					sum += i;
				else {
					sum += i;
					sum = sum + (num/i);
				}
				sum = sum - num;
			}
				
		}
		if(sum > num)
			result = true;
		
		return result;
	}

}
