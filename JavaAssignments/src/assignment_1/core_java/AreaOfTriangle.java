// 6. Write a program to calculate the area of a triangle. Users will enter the values for base and height of the triangle.

package assignment_1.core_java;

import java.util.*;

public class AreaOfTriangle {

	public static void main(String[] args) {
		
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the width of the Triangle:");
			double base = s.nextDouble();
			System.out.println("Enter the height of the Triangle:");
			double height = s.nextDouble();
			double area = (base* height)/2;
			System.out.println("Area of Triangle is: " + area);
		} 
	}
}
