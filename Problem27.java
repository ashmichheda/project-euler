package com.prog.ProjectEulerPrograms;

public class Problem27 {

	public static void main(String[] args) {
		
		int a, b, n, previousCount = 0, count = 1, answer = 0;
		boolean check = false;
		// log start time
		long start = System.currentTimeMillis();
		for(a = -999; a<1000; a++) {
			
			for(b = 2; b<1000; b++) {
				
				if(checkPrime(b)) {
					
					for(n = 1; check==false; n++) {
						
						if((n*n + a*n + b) > 0 && checkPrime(n*n + a*n + b)) {
							count++;
						}
						else
							check = true;
					}
					
					if(count > previousCount) {
						previousCount = count;
						answer = a*b;
					}
					
				}
				count = 1;
				check = false;
			}
		}
		// log end time
		long end = System.currentTimeMillis();
		System.out.println("Answer is: "+answer);
		System.out.println("Count is: "+previousCount);
		System.out.println("Execution time in milliseconds: "+(end - start)+" ms");
	}

	private static boolean checkPrime(int n) {
		
		boolean result = true;
		
		if(n == 2 || n == 3)
			result = true;
		
		else {
			
			for(int i = 2; i<= Math.sqrt(n); i++) {
				
				if(n % i == 0)
					result = false;
			}
			return result;
		}
		return result;
	}

}
