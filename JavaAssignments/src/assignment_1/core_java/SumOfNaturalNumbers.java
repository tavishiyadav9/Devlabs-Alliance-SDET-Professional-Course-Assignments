// 7. Write a program to print the sum of the first 20 natural numbers. 

package assignment_1.core_java;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		
		int num = 20, sum = 0;
		int i = 1;
		while(i <= num)
		{
    	   sum += i;
    	   i++;
    	}
		System.out.println("Sum of first 20 natural numbers is: "+sum);
	}
}
