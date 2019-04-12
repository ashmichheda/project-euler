/*
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms.
Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

*/



package com.prog.ProjectEulerPrograms;

public class Problem14 {

	public static void main(String[] args) {
		
		int maxValue = 1000000, count = 0, temp = 0;
		long  n = 0, answer = 0;
		
		for(int j = (maxValue-1); j>0; j--) {
			n = j;
			while(n != 1) {
				if(n % 2 == 0) {
					n = n/2;
					temp++;
				}
				else {
					n = 3*n + 1;
					temp++;
				}
			}
			if(temp > count) {
				count = temp;
				answer = j;
			}
			temp = 0;	
			
		}
		System.out.println("Answer is: "+answer);

	}

}
