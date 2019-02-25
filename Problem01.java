// Find the sum of all the multiples of 3 or 5 below 1000

package com.prog.ProjectEulerPrograms;

public class Problem01 {
	public static void main(String[] args) {
		int i, sum = 0;
		for(i = 1; i<1000; i++) {
			if(i%3 == 0 || i%5 == 0)
				sum += i;
		}
		System.out.println(sum+" is the answer");
	}
}
