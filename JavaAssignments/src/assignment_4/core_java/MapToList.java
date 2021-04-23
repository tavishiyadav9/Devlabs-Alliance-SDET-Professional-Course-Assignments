// 4. Convert keys of a map to a list. 

package assignment_4.core_java;

import java.util.*;

public class MapToList {

	public static void main(String[] args) {
		
		Map<Integer,String> colorMap = new HashMap<Integer,String>();
		colorMap.put(1,"Red");
		colorMap.put(2,"Yellow");
		colorMap.put(3,"White");
		colorMap.put(4,"Peach");
		colorMap.put(5,"Black");
		
		List<Integer> keyList = new ArrayList<Integer>(colorMap.keySet());
		List<String> valueList = new ArrayList<String>(colorMap.values());
		
		System.out.println("Keys list: ");
		for(int key : keyList)
		{
			System.out.print(key+" ");
		}
		
		System.out.println("\n\nValues list: ");
		for(String value : valueList)
		{
			System.out.print(value+" ");
		}
	}

}
