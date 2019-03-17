// Find the largest palindrome made from the product of two 3-digit numbers.

package com.prog.ProjectEulerPrograms;

public class Problem04 {

	public static void main(String[] args) {

		int i = 999, j = 999, rev = 0, ans1, greatestPalin = 0, d, temp;
		
		for(i = 999; i>= 100; i--) {
			for(j = 999; j>=100; j--) {
				rev = 0;
				ans1 = i*j;
				temp = ans1;
				// find reverse of the number temp
				while(temp!= 0) {
					d = temp % 10;
					rev = rev*10 + d;
					temp = temp/10;
				}
				if((rev == ans1) && (ans1 > greatestPalin))
					greatestPalin = ans1;
			}
		}
		System.out.println(greatestPalin + " is the greatest palindrome of two 3 digit nos");

	}

}
