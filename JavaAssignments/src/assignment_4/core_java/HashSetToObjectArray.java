// 5. Copy all elements of a HashSet to an Object array. 

package assignment_4.core_java;

import java.util.*;

public class HashSetToObjectArray {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet = new HashSet<Integer>();
		hashSet.add(1);
		hashSet.add(2);
		hashSet.add(3);
		hashSet.add(4);
		hashSet.add(5);
	   
	    Object[] objArr = hashSet.toArray();
	    for(int i = 0; i < objArr.length; i++)
	    {
	    	System.out.print(objArr[i]+" ");
	    }

	}

}
