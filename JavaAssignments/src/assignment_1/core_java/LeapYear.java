// 4. Write a program to check whether the current year is leap year or not. Users will enter a year value.

package assignment_1.core_java;

import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year you want to check:\n");
	    try (Scanner s = new Scanner(System.in)) {
			int year = s.nextInt();
			int flag = 0;
			if(year%4 == 0)
			{
				if(year%100 == 0)
				{
					if(year%400 == 0)
					{
						flag = 1;
					}
				}
				else
				{
					flag = 1;
				}
			}
			if (flag == 1)
			{
				System.out.println("Given year is a leap year.");
			}
			else
			{
				System.out.println("Given year is not a leap year.");
			}
		}
	}
}
