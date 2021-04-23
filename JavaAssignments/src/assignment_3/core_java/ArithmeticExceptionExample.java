// 6. Write a program where a method declares that it throws ArithmeticException.

package assignment_3.core_java;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		
		try{
	         int num = 3;
	         int output = num/0;
	         System.out.println(output);
	      }catch(ArithmeticException e)
	      {
	    	  System.err.println("Exception caught!");
	    	  System.out.println("A number cannot be divided by 0!");
	      }
	}
}
