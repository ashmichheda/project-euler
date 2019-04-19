package com.prog.LeetCodeProgs;

public class Problem19 {

	public static void main(String[] args) {


		// TODO Auto-generated method stub
		int day = 1;
		int month = 1;
		int year = 1901;

		
		int daysInMonth = 0;
		int dayOfMonth = 0;
		
		int sunday = 2;
		int numOfSundays = 0;
		
		
		while (year <= 2000) {
			if (month == 1 || month == 3 || month == 5 || month ==7 || month == 8 || month == 10 || month == 12) {
				daysInMonth = 31;
			}
			else if (month == 4 || month == 6 || month == 9 || month == 11) {
				daysInMonth = 30;
			}
			else if (month == 2 && year % 4 == 0) {
				daysInMonth = 29;
			}
			else if (month == 2) {
				daysInMonth = 28;
			}
		
			dayOfMonth++;
			sunday++;
			
			if (sunday > 7) {
				sunday = 1;
			}
			
			if (dayOfMonth > daysInMonth) {
				dayOfMonth = 1;
				month++;
				
				if (month > 12) {
					month = 1;
					year++;
				}
				if (day == 1 & sunday == 1) {
					numOfSundays++;
				}
			}
			//System.out.println(dayOfMonth + "/" + month + "/" + year);
			//System.out.println(numOfSundays);
			
		}	
		System.out.println("Sundays on the first of the month during the twentieth century are: "+numOfSundays);

	}

}
