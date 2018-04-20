// Name: Chelby Rhoades
// A java program - circle.java that prompts for the lengths of the radius and then 
// calculates and displays teh area and circumference of the circle.
// Prompts for the circumference. it then calculates and displays the diameter of 
// of the circle. The printed output should be rounded to the nearest hundredth

import java.util.Scanner;

public class circle{
	public static void main(String[] args)
	{	
		//import the scanner
		Scanner scanner = new Scanner(System.in);
		//Ask user for radius
		System.out.print("Enter the radius of the circle");
		//the input
		double radius = scanner.nextDouble();
		//calculate the area
		double area = Math.PI * (radius * radius);
		//print the area
		System.out.printf("The area of the circle is %5.2f\n", area);
		//print the circumference
		double circumference = (2 * Math.PI * radius);
		System.out.printf("The circumference of the circle is %5.2f", circumference);
		System.out.println();
		System.out.println();
		//Ask user for circumference
		System.out.print("Enter the circumference of a Circle: ");
		//the input for circumference
		double circle2 = scanner.nextDouble();
		//
		double diameter = circle2 / Math.PI;
		System.out.printf("The diameter of the circle is %5.2f\n", diameter);
	}
}