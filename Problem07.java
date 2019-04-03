// What is the 10 001st prime number?


package com.prog.ProjectEulerPrograms;

public class Problem07 {

	public static void main(String[] args) {

		// assigned count 1 for prime number 2
		int count = 1;
		int prime = 3, primeNumber = 0;
		boolean isPrime = true;
		while(count != 10001) {
			isPrime = true;
			for(int i = 2; i <= prime/2; i++) {
				
				if(prime % i == 0) {
					isPrime = false;
					break;					
				}
			}
			if(isPrime) {
				count++;
				primeNumber = prime;
				prime++;
			}
			else {
				prime++;
			}
		}
		System.out.println("10001st prime no is: "+primeNumber);

	}

}
