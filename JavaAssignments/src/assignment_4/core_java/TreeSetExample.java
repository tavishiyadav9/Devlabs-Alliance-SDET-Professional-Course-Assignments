// 6. Get highest and lowest value stored in TreeSet.

package assignment_4.core_java;

import java.util.*;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(3);
		treeSet.add(5);
		treeSet.add(2);
		treeSet.add(1);
		treeSet.add(4);
		System.out.println("Highest value stored in TreeSet is: "+treeSet.last());
	    System.out.println("Lowest value stored in TreeSet is: "+treeSet.first());
	}

}
