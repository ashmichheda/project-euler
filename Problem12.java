package com.prog.ProjectEulerPrograms;

public class Problem12 {

	public static void main(String[] args) {
		
		int number = 0, i = 1;
		// log start time
		long start = System.currentTimeMillis();
		while(numberOfDivisor(number) < 500) {
			number += i;
			i++;
		}
		// log end time
		long end = System.currentTimeMillis();
		System.out.println(number+" is the answer!");
		System.out.println("Execution time in milliseconds: "+(end - start)+" ms");
	}

	private static int numberOfDivisor(int number) {

		int sqrt = (int) Math.sqrt(number);
		int count = 0;
		for(int i = 1; i<=sqrt; i++) {
			
			if(number % i == 0)
				count += 2;
		}
		// check for perfect square
		if(sqrt*sqrt == number)
			count--;
		return count;
	}

}
