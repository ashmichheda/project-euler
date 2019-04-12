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
