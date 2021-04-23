// 4. Write a program to convert String to a character array and character array to String.

package assignment_3.core_java;

public class StringChar {
	
	static void stringToCharArray(String str)
	{
		char[] charArr = str.replaceAll("\\s","").toCharArray();  
		for(int i = 0; i < charArr.length; i++)
		{  
		System.out.print(charArr[i]+" ");
		}
	}
	
	static void charArrayToString(char charArr[])
	{
		int len = charArr.length;
		StringBuilder str = new StringBuilder();
		for(int i = 0; i < len; i++)
		{
			str.append(charArr[i]);
		}
		System.out.println("\n"+str);
	}

	public static void main(String[] args) {
		
		String str = "DevLabs Alliance Training";
		stringToCharArray(str);
		char[] charArr = {'D','e','v','L','a','b','s',' ','A','l','l','i','a','n','c','e',' ','T','r','a','i','n','i','n','g'};
		charArrayToString(charArr);
	}

}
