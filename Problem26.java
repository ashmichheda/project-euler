package com.prog.ProjectEulerPrograms;

public class Problem26 {

	public static void main(String[] args) {
		
	int sequenceLength = 0;
        int num = 0;
	// execution start time
        long start = System.currentTimeMillis();
        for (int i = 1000; i > 1; i--) {
            if (sequenceLength >= i) {
                break;
            }

            int[] foundRemainders = new int[i];
            int value = 1;
            int position = 0;

            while (foundRemainders[value] == 0 && value != 0) {
                foundRemainders[value] = position;
                value *= 10;
                value %= i;
                position++;
            }

            if (position - foundRemainders[value] > sequenceLength) {
                num = i;
                sequenceLength = position - foundRemainders[value];                    
            }
        }
	// execution end time
        long end = System.currentTimeMillis();
        System.out.println("Value of d is: "+num);
        System.out.println("Execution time in milliseconds: "+(end - start)+" ms");
        
	}
}
