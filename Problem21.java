/*
For example, the proper divisors of 220 are 1, 2, 4, 5, 10, 11, 20, 22, 44, 55 and 110; 
therefore d(220) = 284. The proper divisors of 284 are 1, 2, 4, 71 and 142; so d(284) = 220.

Evaluate the sum of all the amicable numbers under 10000.
 */



package com.prog.ProjectEulerPrograms;

public class Problem21 {

	public static void main(String[] args) {
		
		int num = 1, sum = 0;
		
		while(num != 10000) {
			
			int a = findSum(num);
			int b = getDivisors(a);
			boolean result = checkForAmicablePair(a, b, num);
			if(result)
				sum += num;
			num++;
		}
		
		System.out.println("Sum of all the amicable numbers under 10000 is: "+sum);
	}

	private static int getDivisors(int a) {

		int sum = 0;
		for(int i = 1; i<a; i++)
		{
			if(a % i == 0)
				sum += i;
		}
		
		return sum;
	}

	private static int findSum(int num) {
		int sum = 0;
		for(int i = 1; i<num; i++)
		{
			if(num % i == 0)
				sum += i;
		}
		
		return sum;
	}
	
	private static boolean checkForAmicablePair(int a, int b, int num) {
		
		if(num == b && a!= num)
			return true;
		
		return false;
	}

}
