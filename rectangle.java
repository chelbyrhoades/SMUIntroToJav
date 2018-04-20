//Name: Chelby Rhoades
// This program calculates the area and perimeter of a rectangle. The user 
// gives input and the system magically gives output

import java.util.Scanner;

public class rectangle
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the length of the rectangle?");
		int length = input.nextInt();
		System.out.print("What is the length of its Width?");
		int width = input.nextInt();

		int area = length * width;
		System.out.printf("The are of the rectangle is %d", area);
		System.out.println();
		System.out.printf("The perimeter of the rectangle is %d", (length * 2) + (width * 2));
		System.out.println();
	}
}
