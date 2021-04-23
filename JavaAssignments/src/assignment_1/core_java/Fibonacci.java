// 2. Write a program to print fibonacci series (10 values).

package assignment_1.core_java;

public class Fibonacci {

	public static void main(String[] args) {
		{
	        int value = 10;
	        int num1 = 0, num2 = 0, num3 = 1;
	        System.out.println("Fibonacci Series (upto "+value+" values):\n");
	        for(int i = 1; i <= value; i++)
	        {
	            num1 = num2;
	            num2 = num3;
	            num3 = num1 + num2;
	            System.out.println(num1);
	        }
	    }

	}

}
