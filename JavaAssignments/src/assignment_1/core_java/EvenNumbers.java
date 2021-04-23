// 9. Write a program to print only even numbers till 50.

package assignment_1.core_java;

public class EvenNumbers {

	public static void main(String[] args) {
		
		int num = 50;
		System.out.println("Even numbers till "+num+" are:");
		for(int i = 0; i <= num; i++)
		{
			if(i%2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
