// 5. Write a program to throw NumberFormatException and handle it appropriately with a proper message.

package assignment_3.core_java;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		
		try 
	    {
	    	int num = Integer.parseInt("Three");
	    	System.out.println(num);
	    }catch(NumberFormatException e)
	    {
	    	System.err.println("Exception caught!");
	    	System.out.println("Enter a valid number!");
	    } 
	}

}
