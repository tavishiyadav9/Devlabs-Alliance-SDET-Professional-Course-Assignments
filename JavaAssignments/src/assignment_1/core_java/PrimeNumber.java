// 5. Write a program to print the first 10 prime numbers.

package assignment_1.core_java;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("The first 10 prime numbers are:\n2");
		int flag = 1, num = 3;
		for(int i = 2; i <= 10;)
		{
			for(int j = 2; j <= Math.sqrt(num); j++)
			{
				if(num%j == 0)
				{
					flag = 0;
					break;
				}
			}
			if(flag == 1)
			{
				System.out.println(num);
				i++;
			}
			flag = 1;
			num++;
		}
	}
}
