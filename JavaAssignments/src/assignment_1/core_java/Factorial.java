// 1. Write a program to calculate the factorial of a number using a while loop.

package assignment_1.core_java;

public class Factorial {

	public static void main(String[] args) {
		int num = 9, i = 1;
        long fact = 1;
        if (num <= 0)
        {
        	System.out.println("Enter a valid number!");
        }
        else
        {
        	while(i <= num)
            {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of the given number is: "+fact);
        }
	}
}
