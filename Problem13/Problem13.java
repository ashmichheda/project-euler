package com.prog.ProjectEulerPrograms;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Problem13 {

	public static void main(String[] args) throws FileNotFoundException {

		BigInteger b[] = new BigInteger[100];
		BigInteger sum = new BigInteger("0");
		
		try {
			FileInputStream file = new FileInputStream("D:\\AshmiD\\ASHMI\\GitHub\\Project-Euler-Programs\\Problem13\\input.txt");
			DataInputStream data = new DataInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(data));
			
			String s;
			int i = 0;
			
			do {
				s = br.readLine();
				b[i] = new BigInteger(s);
				sum = sum.add(b[i]);
				i++;
			}while(i != 100);
			
			String firstTenDigit = ""+sum;
			String answer = firstTenDigit.substring(0, 10);
			System.out.println("The number is: "+answer);
			br.close();
		}
	
		catch(Exception e) {
			e.getMessage();
		}
	}
}
