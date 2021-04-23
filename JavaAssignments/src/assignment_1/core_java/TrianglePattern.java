// 10. Write a program to print this output using a two-dimensional array.

package assignment_1.core_java;

public class TrianglePattern {

	public static void main(String[] args) {
		
		int rows = 10;
		for (int i = 1; i <= rows; i++) 
		{
			for (int j = rows; j >= i; j--) 
			{
                System.out.print(" ");
            }
			for (int j = 1; j <= i; j++) 
			{
                System.out.print("0 ");
            }
			System.out.println("\n");
        }
	}
}
