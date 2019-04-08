//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

package com.prog.ProjectEulerPrograms;

public class Problem09 {

	public static void main(String[] args) {
		
		int a,b,c, ans = 0;
		
		outer: for(a = 1; a<1000; a++) {
			for(b = 1; b<1000; b++) {
				
				for(c = 1; c<1000; c++) {
					
					if((c*c == (a*a) + (b*b)) && (a+b+c == 1000)) {
						System.out.println("a: "+a+"| b: "+b+"| c: "+c);
						ans = a*b*c;
						System.out.println(ans +" is the product abc!");
						break outer;
					}
				}
			}
		}
	}

}
