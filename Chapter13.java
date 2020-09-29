import java.util.Scanner;
public class ApplianceCost {
public static void main(String[] args) {
double cost = 0;
double used = 0;
Scanner scanner = new Scanner(System.in);

System.out.print("Enter cost per kilowatt-hour in cents:");
cost = Double(scanner.nextLine);

System.out.print("Enter kilowatt-hours used per year:");
used = Double(scanner.nextLine());

System.out.format("Annual cost:", cost*used*0.01);

}
}

// Exersise 1

import java.util.Scanner;

	public class FallingTime

	{
	  public static void main (String [] args)

	  {
	    double fallingTime;

	    Scanner scanner=new Scanner(System.in);

	    System.out.println("Ener the falling time (in seconds): ");

	    fallingTime=scanner.nextDouble();

	    fallingDistance(fallingTime);

	  }

	    public static void fallingDistance(double fallingTime)
    {
	     double a=0.5, g=9.8;//0.5=1/2

	      double d=(a*g)*(fallingTime*fallingTime);

	    {

	       System.out.println(""); 
	    }
	    }
	}
  
  // Exersise 2
  
  // I have no clue what a logarithm is or how to do this exersise, help please. (Ex. 3) 
  
  import java.util.scanner
  public class Harmonic
  {
  public static void main (String[] args) 
 {
  
  Scanner x = new Scanner(System.in);
  System.out.println("Enter X:")
  int x = nextInt(); 
  Scanner y = new Scanner(System.in);
  System.out.println("Entry Y:");
  int y = nextInt();
  
  H = 2 / ( 1/X + 1/Y );
  
  System.out.println(H + "Is the Harmonic Mean.);
  }
  }
  
  //  Example 4 
  
  
  
