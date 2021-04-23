// 8. Get Set view of keys from HashTable.

package assignment_4.core_java;

import java.util.*;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer,String> hashTable = new Hashtable<Integer,String>();
		hashTable.put(1,"Red");
		hashTable.put(2,"Yellow");
		hashTable.put(3,"White");
		hashTable.put(4,"Peach");
		hashTable.put(5,"Black");
	   
		Enumeration<Integer> e = hashTable.keys();
	    while(e.hasMoreElements()) 
	    {
	    	System.out.println(e.nextElement());
	    }
	}

}
