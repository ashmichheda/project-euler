package com.prog.ProjectEulerPrograms;

import java.io.BufferedReader;
import java.io.FileReader;

public class Problem08 {

	public static void main(String[] args) {
		
		BufferedReader reader;
		long max = 0, greatestProduct;
		try {
			// Add your local Input file path
			reader = new BufferedReader(new FileReader("Input.txt"));
			String line = reader.readLine();
			int length = line.length();
		
			for(int i = 0; i < length-13; i++) {
				greatestProduct = Character.getNumericValue(line.charAt(i));
				for(int j = 1; j<13; j++) {
					greatestProduct *= Character.getNumericValue(line.charAt(i+j));
				}
				
				if(greatestProduct > max)
					max = greatestProduct;
			}
			System.out.println("thirteen adjacent digits in the 1000-digit with greatest product is: "+max);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
