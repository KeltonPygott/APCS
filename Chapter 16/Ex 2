  import java.util.Scanner;

public class OrderChecker {
	public static void main (String [] args) {

		// Variables

		Scanner input = new Scanner(System.in);
		int bolts, nuts, washers;
		double cost;

		//Ejecucion

		System.out.println("Bolt Count:");
		bolts = input.nextInt();

		System.out.println("Nut Count:");
		nuts = input.nextInt();

		System.out.println("Washer Count:");
		washers = input.nextInt();

		if (bolts > nuts){
			System.out.println("Checking...");
			System.out.println("Error in Calculation.");
		} else {
			cost = (bolts * .05) + (nuts * .03) + (washers * .01);
			System.out.println("Order Calculated and Ready");
			System.out.println("The total cost is:" + cost);
		}
	}
}
