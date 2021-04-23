// 1. Write a program to print the occurrence of each character in the String “DevLabs Alliance Training”.

package assignment_3.core_java;

public class CharacterOccurrence {
	
	static void countChar(String givenStr)
	{ 
		String str = givenStr.replaceAll("\\s", "");
		int charArr[] = new int[256];
		int len = str.length(); 
		int i = 0;
		for(i = 0; i < len; i++)
		{
			charArr[str.charAt(i)]++;
		}
		char stringCharArr[] = new char[len];
		for(i = 0; i < len; i++) 
		{
			stringCharArr[i] = str.charAt(i); 
		int flag = 0;
		for (int j = 0; j <= i; j++)
		{
			if (str.charAt(i) == stringCharArr[j])
			{
				flag = 1;
			}
		}
		if(flag == 1)
		{
		      System.out.println("Occurrence of character "+str.charAt(i)+" in the given string is: "+charArr[str.charAt(i)]);             
		}
	    }
	}

	public static void main(String[] args) {
		
		String str = "DevLabs Alliance Training";
		countChar(str);
	}

}
