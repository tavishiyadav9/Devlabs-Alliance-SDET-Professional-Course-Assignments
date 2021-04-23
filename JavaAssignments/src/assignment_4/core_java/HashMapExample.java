// 3. Check if a particular key exists in HashMap.

package assignment_4.core_java;

import java.util.*;

public class HashMapExample {
	
	static boolean checkKey(String givenStr, char key)
	{
		String str = givenStr.replaceAll("\\s", "");
		Map<Character,Integer> charMap = new HashMap<Character,Integer>();
		char[] charArr = str.toCharArray();
		int value = 1;
		for(Character character : charArr) 
		{
			charMap.put(character, value);
			value++;
        } 
		if(charMap.containsKey(key))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static void main(String[] args) {
		
		String str = "DevLabs Alliance Training";
		char key = 'T';
		if(checkKey(str, key))
		{
			System.out.println("The key \'"+key+"\' is present in the HashMap.");
		}
		else
		{
			System.out.println("The key \'"+key+"\' is not present in the HashMap.");
		}
	}

}
