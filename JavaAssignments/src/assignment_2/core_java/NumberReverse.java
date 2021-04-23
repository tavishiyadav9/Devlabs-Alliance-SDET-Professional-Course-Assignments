// 5. Reverse a number 123.

package assignment_2.core_java;

public class NumberReverse {
	
	static int reversedNum = 0;
	public static int reverseNumber(int num)
	{
		while(num != 0)
		{
			reversedNum = reversedNum * 10;
			reversedNum = reversedNum + num%10;
	        num = num/10;
	    }
		return reversedNum;
	}

	public static void main(String[] args) {
		
		int num = 123;
		System.out.println("Reverse of number is: "+reverseNumber(num));
	}
}
