// NOTE: Use BigDecimal OR BigInteger. Doesn't work with int or long.


package com.prog.ProjectEulerPrograms;

import java.math.BigInteger;

public class Problem25 {

	public static void main(String[] args) {
		
		int index = 2;
		BigInteger f1 = BigInteger.ONE;
		BigInteger f2 = new BigInteger("1");
		BigInteger fib = new BigInteger("0");
		long firstThousandthTerm;
		// log start time
		long start = System.currentTimeMillis();
		while(true) {
			
			fib = f1.add(f2);
			index++;
			if((""+fib).length() == 1000) {
				firstThousandthTerm = index;
				break;
			}
			else {
				f1 = f2;
				f2 = fib;
			}
		}
		// log start time
		long end = System.currentTimeMillis();
		System.out.println("Index of the 1st 1000th fib term is: "+firstThousandthTerm);
		System.out.println("Execution time in milliseconds: "+(end - start)+" ms");
	}

}
