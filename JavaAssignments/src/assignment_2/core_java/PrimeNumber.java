// 3. Is 13 a prime number? 

package assignment_2.core_java;

public class PrimeNumber {

	public static void main(String[] args) {
		
		int num = 13;
		int flag = 1;
		for(int i = 2 ; i <= num/2; i++)
		{
			int temp = num%i;
			if(temp == 0)
		   {
		      flag = 0;
		      break;
		   }
		}
		if(flag == 1)
		{
			System.out.println(num + " is a prime number.");
		}
		else
		{
			System.out.println(num + " is not a prime number.");
		}
	}
}
