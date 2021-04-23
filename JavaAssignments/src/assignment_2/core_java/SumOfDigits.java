// 4. Find the sum of digits.

package assignment_2.core_java;

public class SumOfDigits {
	
	public static int sum(int num)
    {
		int sum = 0;
		while(num != 0)
        {
			sum = sum + num%10;
			num = num/10;
        }
		return sum;
    }

	public static void main(String[] args) {
		
		int num = 1234;
		System.out.println("Sum of digits in the given number is: "+sum(num));
	}
}
