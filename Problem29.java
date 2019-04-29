package com.prog.ProjectEulerPrograms;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Problem29 {

	public static void main(String[] args) {
		
		
		int i, j, count = 0;;
		BigInteger answer = new BigInteger("2");
		Map<BigInteger, Integer> storedValues = new HashMap<BigInteger, Integer>();
		
		for(i = 2; i<= 100; i++) {
			for(j = 2; j<=100; j++) {
				answer = BigInteger.valueOf(i);
				
				if(storedValues.isEmpty()) 
					storedValues.put(answer.pow(j), count++);
					
					
				
				else if(!storedValues.isEmpty() && !storedValues.containsKey(answer.pow(j))) {
					storedValues.put(answer.pow(j), count++);
				}
			}
		}
		System.out.println("Distinct terms are: "+count);
	}

}
