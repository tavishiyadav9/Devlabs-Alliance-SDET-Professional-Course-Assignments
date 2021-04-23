// 3. Write a program to check “brown” is present in the string: A brown fox ran away fast.

package assignment_3.core_java;

public class StringOccurrence {
	
	static boolean checkStringOccurrence(String str, String word)
	{
		if(str.contains(word))
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		
		String sentence = "A brown fox ran away fast";
		String word = "brown";
		if(checkStringOccurrence(sentence, word))
		{
			System.out.println("The sentence \'"+sentence+"\' contains the string \'"+word+"\'.");
		}
		else
		{
			System.out.println("The sentence \'"+sentence+"\' does not contain the string \'"+word+"\'.");
		}
	}
}
