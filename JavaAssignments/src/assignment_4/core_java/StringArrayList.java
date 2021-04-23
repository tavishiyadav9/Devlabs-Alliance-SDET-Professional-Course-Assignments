// 7. Sort ArrayList of Strings alphabetically.

package assignment_4.core_java;

import java.util.*;

public class StringArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> strlist = new ArrayList<String>();   
		strlist.add("Jake");   
		strlist.add("Amy");   
		strlist.add("Gina");   
		strlist.add("Holt");   
		strlist.add("Terry");   
		strlist.add("Scully");   
		strlist.add("Rosa");  
		strlist.add("Charles");  
		strlist.add("Hitchcock");
		Collections.sort(strlist);   
		System.out.println("Sorted ArrayList of Strings: "+ strlist);   
	}

}
