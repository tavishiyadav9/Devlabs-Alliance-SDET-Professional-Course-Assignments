// 8. Write a program to reverse the elements of an array where the array size as well as the array values are entered by the user. 

package assignment_1.core_java;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the size of the Array: ");
			int n = s.nextInt();
			int arr[] = new int[n];
			int i = 0;
			for(i = 0; i < n; i++)
			{
			    System.out.print("Enter element "+(i+1)+": ");
			    arr[i] = s.nextInt();
			}
			int j = i - 1;
			i = 0;     
			while(i < j)
			{
			   int temp = arr[i];
			   arr[i] = arr[j];
			   arr[j] = temp;
			   i++;
			   j--;
			}
			System.out.print("\nReversed array: ");
			for(i = 0; i < n; i++)
			{
			   System.out.print(arr[i]+ "  ");
			}
		}    

	}

}
