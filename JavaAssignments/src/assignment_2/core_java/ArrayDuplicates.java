//6. Find the duplicates in an array 12, 32, 12, 45, 65, 93, 0, 23, 45, 6.

package assignment_2.core_java;

public class ArrayDuplicates {

	public static void main(String[] args) {
		
		 int[] arr = {12,32,12,45,65,93,0,23,45,6};
		 int len = arr.length;
		 int k = 0;
		 int[] outputArr = new int[len];
		 for(int i = 0; i < len-1; i++)
		 {
			 for(int j = i+1; j < len; j++)
			 {
				 if((arr[i] == arr[j]) && (i != j))
				 {
					 outputArr[k] = arr[j];
					 k++;
			     }
	         }
	     }
		System.out.println("Duplicate element(s):");
		 for(int i = 0; i < k; i++)
		 {
			 System.out.println(outputArr[i]);
		 }
	}
}
