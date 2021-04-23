// 7. Write a program with nested try blocks. 

package assignment_3.core_java;

public class NestedTryBlocks {

	public static void main(String[] args) {
		
		try{
			try{
				int num = 3;
				int output = num/0;
				System.out.println(output);
				}catch(NumberFormatException e)
			    {
					System.err.println("NumberFormatException caught!");
					System.out.println("\nEnter a valid number!");
	            }
	       }catch(ArithmeticException e)
		   {
	    	   System.err.println("Arithmetic Exception caught!");
	    	   System.out.println("\nA number cannot be divided by 0!");
	       }
	    }
	}
