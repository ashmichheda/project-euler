/*
 Using names.txt (right click and 'Save Link/Target As...'), 
 a 46K text file containing over five-thousand first names, 
 begin by sorting it into alphabetical order. 
 Then working out the alphabetical value for each name, 
 multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, 
COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. 
So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
 */

package com.prog.ProjectEulerPrograms;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Problem22 {

	public static void main(String[] args) throws IOException {

		final Map<String, Integer> alphabets = new HashMap<String, Integer>();
		alphabets.put("A", 1);
		alphabets.put("B", 2);
		alphabets.put("C", 3);
		alphabets.put("D", 4);
		alphabets.put("E", 5);
		alphabets.put("F", 6);
		alphabets.put("G", 7);
		alphabets.put("H", 8);
		alphabets.put("I", 9);
		alphabets.put("J", 10);
		alphabets.put("K", 11);
		alphabets.put("L", 12);
		alphabets.put("M", 13);
		alphabets.put("N", 14);
		alphabets.put("O", 15);
		alphabets.put("P", 16);
		alphabets.put("Q", 17);
		alphabets.put("R", 18);
		alphabets.put("S", 19);
		alphabets.put("T", 20);
		alphabets.put("U", 21);
		alphabets.put("V", 22);
		alphabets.put("W", 23);
		alphabets.put("X", 24);
		alphabets.put("Y", 25);
		alphabets.put("Z", 26);
		
		@SuppressWarnings("resource")
		String fileContent = new Scanner(new File("D:\\AshmiD\\ASHMI\\GitHub\\Project-Euler-Programs\\Problem22\\names.txt"))
				.useDelimiter("\\Z").next();
		
		String namesList[] = fileContent.split(",");
		List<String> names = new ArrayList<String>();
		long start = System.currentTimeMillis();
		// add names to list and sort them alphabetically
		for(String name : namesList) {
			names.add(name.substring(1, name.length()-1));
		}
		Collections.sort(names);
		
		int sum = 0, pos = 1, nameScore = 0, result = 0;
		HashMap<String, Integer> positions = new HashMap<String, Integer>();
		
		for(int i = 0; i<names.size(); i++) {
			positions.put(names.get(i), pos);
			pos++;
		}
			
		for(int i = 0; i<names.size(); i++) {
			nameScore = 0;
			String value = names.get(i);
			for(int j = 0; j<value.length(); j++) {
				nameScore += alphabets.get(""+value.charAt(j));
			}
			sum = nameScore * positions.get(value);
			result += sum;
			
		}
		long end = System.currentTimeMillis();
		System.out.println("Total namescores is: "+result);
		System.out.println("Execution time in milliseconds: "+(end - start)+" ms");
	}

}
