// 2. Reverse an Arraylist.

package assignment_4.core_java;

import java.util.*;

public class ReverseArrayList {
	
	static void reverseArrayList(ArrayList<Integer> intList)
	{
		ArrayList<Integer> reversedArrList = new ArrayList<Integer>();
		int size = intList.size();
		for(int i = size-1; i >= 0; i--) 
		{
			reversedArrList.add(intList.get(i));
        }
		for(int i = 0; i < size; i++) 
		{
            System.out.print(reversedArrList.get(i)+" ");
        }
	}

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		arrList.add(4);
		arrList.add(5);
		reverseArrayList(arrList);
	}

}
