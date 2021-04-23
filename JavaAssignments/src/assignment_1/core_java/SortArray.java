// 3. Write a program to sort the elements of an array in ascending order.

package assignment_1.core_java;

public class SortArray {

	public static void main(String[] args) {
		     
        int[] arr = new int[] {3,5,4,1,2};
        int len = arr.length;
        int temp = 0;    
        for (int i = 0; i < len; i++) 
        {
        	for (int j = i+1; j < len; j++) 
        	{     
               if(arr[i] > arr[j]) 
               {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
        System.out.println("Elements of an array sorted in ascending order:\n");    
        for (int i = 0; i < len; i++) {     
            System.out.print(arr[i] + " ");    
        }   
	}
}
