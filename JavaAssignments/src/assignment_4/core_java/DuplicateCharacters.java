// 1. Find duplicate characters with their occurrences count using HashMap.

package assignment_4.core_java;

import java.util.*;

public class DuplicateCharacters {
	
	static void countChar(String givenStr)
	{
		String str = givenStr.replaceAll("\\s", "");
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char[] charArr = str.toCharArray();
		for(Character character : charArr) 
		{
			if(charMap.containsKey(character)) 
			{  
                charMap.put(character, charMap.get(character)+1);  
            } 
			else 
			{  
                charMap.put(character, 1);  
            }  
        }  
		Set<Character> keys = charMap.keySet();
		for(Character character : keys) 
		{
			if (charMap.get(character) > 1) 
			{  
				System.out.println("Occurrence of character "+character+" in the given string is: " + charMap.get(character));
            }  
        }  
	}

	public static void main(String[] args) {
		
		String str = "DevLabs Alliance Training";
		countChar(str);

	}

}
