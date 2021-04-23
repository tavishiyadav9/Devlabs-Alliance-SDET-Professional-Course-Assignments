// 2. Find all the odd numbers from 79 to 187.

package assignment_2.core_java;

public class OddNumbers {

	public static void main(String[] args) {
		
		int low = 79, high = 187;
		System.out.println("Odd numbers from 79 to 187 are:");
		for(int i = low; i <= high; i++)
		{
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
	}
}
