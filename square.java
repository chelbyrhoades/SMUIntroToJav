// asks for side and then gives the area
// add comments
// Name: Chelby Rhoades
// This program asks for the length of a square. It then calculates the area.
import java.util.Scanner; //this imports the scanner needed

public class square{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What is the length of the square? ");
		int length = input.nextInt(); // this prompts the user for input

		int area = length * length; // area = length times length
		System.out.printf("The area of the square is %d",area);
		System.out.println();
		System.out.printf("The perimeter of the square is %d", length * 4);
		System.out.println();
	}
}