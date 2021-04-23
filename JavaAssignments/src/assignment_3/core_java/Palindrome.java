// 2. Write a program to check if a given string is a palindrome or not. 

package assignment_3.core_java;

public class Palindrome {
	
	static boolean checkPalindrome(String str)
	{
		int len = str.length();
		String reversedString = "";
		for(int i = len-1; i >= 0; i--)
		{
			reversedString += str.charAt(i);
		}
		if(str.equals(reversedString))
		{
			return true;
		}
		else
		{
			return false;
		} 
	}

	public static void main(String[] args) {
		
		String str = "trurt";
		if(checkPalindrome(str))
		{
			System.out.println(str+" is a palindrome.");
		}
		else
		{
			System.out.println(str+" is not a palindrome.");
		}
	}
}
