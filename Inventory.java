//Name: Chelby
// program called Inventory.java which prompts the user to enter 4 values for each of 
// the 3 inventory items: UPC code, quantity, cost, and price
// Your program will calculate the dollars and percent
// After the user enters all 12 values, a summary report of the inventory will print
// along withthe sum of all the profit.

import java.util.Scanner;

public class Inventory {
	public static void main(String[] args) 
	{
	double totalProfit = 0;
    Scanner input = new Scanner(System.in);
	//First product
	  System.out.print("Enter UPC: ");
	  int upc1 = input.nextInt();
	  System.out.print("Enter quantity: ");
	  int quantity1 = input.nextInt();
	  System.out.print("Enter cost: ");
	  int cost1 = input.nextInt();
	  System.out.print("Enter price: ");
	  int price1 = input.nextInt();

	  double profitDollars1 = (price1 - cost1) * quantity1;
  	double profitPercent1 = (price1 = cost1) / cost1 * 100;
  	totalProfit += profitDollars1;

  	//Second product
  	System.out.print("Enter UPC: ");
  	int upc2 = input.nextInt();
  	System.out.print("Enter quantity: ");
  	int quantity2 = input.nextInt();
  	System.out.print("Enter cost: ");
  	int cost2 = input.nextInt();
  	System.out.print("Enter price: ");
  	int price2 = input.nextInt();

  	double profitDollars2 = (price2 - cost2) * quantity2;
	  double profitPercent2 = (price2 = cost2) / cost2 * 100;
	  totalProfit += profitDollars2;

	//Third product
  	System.out.print("Enter UPC: ");
  	int upc3 = input.nextInt();
  	System.out.print("Enter quantity: ");
  	int quantity3 = input.nextInt();
  	System.out.print("Enter cost: ");
  	int cost3 = input.nextInt();
  	System.out.print("Enter price: ");
  	int price3 = input.nextInt();

  	double profitDollars3 = (price3 - cost3) * quantity3;
  	double profitPercent3 = (price3 = cost3) / cost3 * 100;
	  totalProfit += profitDollars3;
  
	  System.out.printf("%10a %10a %10a %10a%10a%10a\n", "UPC code", "Quantity", "Cost", "Price", "Profit $", "Profit %");
	  System.out.printf("%10d %10d $%9.2f $%9.2f $%8.2f%%\n", upc1, quantity1, cost1, price1, profitDollars1, profitPercent1);
	  System.out.printf("%10d %10d $%9.2f $%9.2f $%8.2f%%\n", upc2, quantity2, cost2, price2, profitDollars2, profitPercent2);
	  System.out.printf("%10d %10d $%9.2f $%9.2f $%8.2f%%\n", upc3, quantity3, cost3, price3, profitDollars3, profitPercent3);

	  System.out.println();
	  System.out.printf("Total potential profit: $%9,2f\n", totalProfit);	System.out.println();
	}
}
