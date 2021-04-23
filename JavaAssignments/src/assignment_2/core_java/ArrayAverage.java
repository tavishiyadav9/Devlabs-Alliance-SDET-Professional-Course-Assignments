// 1. Java Program to Calculate average of numbers using Array.

package assignment_2.core_java;

public class ArrayAverage {

	public static void main(String[] args) {
		
		int[] values = {1,2,3,4,5};
		int len = values.length;
        int sum = 0;
        for(int i = 0; i < len; i++)
        {
        	sum += values[i];
        }
        int average = sum/len;
        System.out.print("Average: "+average);
	}
}
