import java.util.Scanner;

	class DiscountPrice
	{
	  public static void main (String[] args) 

	  {

	    Scanner scan = new Scanner( System.in );

	    double purchase;

	    System.out.print("Enter the amount:: ");
	    purchase = scan.nextInt();
	    purchase = purchase - purchase/10    

	 if (purchase > 10)

	       System.out.println("discount: " +

	        (purchase - purchase/10) );
	  }
	}
  
  // Example 1 
  
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

// Example 2  

import java.util.Scanner ;
class LastChanceGas
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );
    int tank, gage, gallon;   
    int gasLeft = 0;           
    int milesLeft = 0;         

    System.out.print("Tank: ");
    tank = scan.nextInt();

    System.out.print("Gage: ");
    gage   = scan.nextInt();

    System.out.print("MPG: ");
    gallon  = scan.nextInt();
   
       
    gasLeft = (tank * gage)/100;   
    milesLeft = gasLeft * gallon;
   
    if (milesLeft < 200)
      System.out.print("Stop ");
   
    else
     
      System.out.print("Continue");
   
  }
}

// Example 3 

import java.util.Scanner;

public class PieContest {

public static void main(String[] args) {

Scanner s = new Scanner(System.in);

System.out.println("Enter your weight in LBS: ");

String temp = s.next();

int weight = Int(temp);

if (weight >= 30 && weight <= 250) {

System.out.println("You're allowed");

} else

System.out.println("You're not allowed.");

}

} 

// Example 4 

    import java.util.Scanner;
    public class GroundBeef {
        public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
       
       System.out.println("Price/LB Package A: ");
        double priceA = scan.nextDouble();
        System.out.println("% lean Package A: ");
        double leanA = scan.nextDouble();
        System.out.println("Price/LB package B: ");
        double priceB = scan.nextDouble();
        System.out.println("% lean package B: ");
        double leanB = scan.nextDouble();
        
        double percentA = 100-leanA;                       
        double percentB = 100-leanB;
        double A = priceA + (percentA*0.01);
        double B = priceB + (percentB*0.01);
        
        System.out.println("");
        System.out.printf("Package A pound of lean: " , A);
        System.out.println("");
        System.out.printf("Package B pound of lean: " , B);
        System.out.println("");
        
     if(A<B){
            System.out.println("package A is the best value");}
        
        else {
            System.out.println("package B is the best value");
            }
        }
      
    }
    
    // Example 5 
    
    
    import Math
    public class Wind {
    public static void main(String[] args) {
        double t = Double(args[0]);
        double v = Double(args[1]);
        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Temperature = " + t);
        System.out.println("Wind speed  = " + v);
        System.out.println("Wind chill  = " + w);
        
  // Example 6 
  
  
  import java.util.scanner;

// Having abit of trouble with the movie ones on 8 and 9, ill come in for SOAR. 
  
