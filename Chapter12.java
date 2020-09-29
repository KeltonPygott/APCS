    import java.util.Scanner;

    public class Area

    {

        public static void main(String[] args) 

        {

            int r;

            double pi = 3.14, area;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter radius of circle:");

            r = s.nextInt();

            area = pi * r * r;

            System.out.println("Area of circle:"+area);

        }            

    }
    
    // Exersise 1
    
    
    import java.util.scanner;
    
    public class CTD
    
    {
      public static void main(String[]) args
      
      {
      
      Scanner s = new Scanner(System.in);
      
      System.out("Input Cents:");
      
      cents = s.nextInt();
      cents / 100 = dollars;
      flt dollars;
      
      System.out.println(dollars);
      }
    }
    
    // Exersise 2
    
    class CorrectChange{

     public static void main(String args[]){

         
          int change = 163; 

         
          int nDollars = change/100;

          change = change % 100;    


          int nQuarters = change/25;

          change %= 25;     


          int nDimes = change/10;

          change %= 10;


          int nNickels = change/5;

          change%=5;

         
          System.out.print("Your change is : "+nDollars+" dollar,");

          System.out.print(nQuarters+" Quarters, "+nDimes+" Dimes, and ");

          System.out.println(change+" cents.");

     }

}

// Exersise 3

  import java.util.scanner

  public class Ohm
  {
  public static void main(String[]) args
{
  
  Scanner volts = new Scanner(System.in);
  
  System.out("What are the volts:");
  
  int volts = nextInt();
  
  Scanner amps = new Scanner(System.in);
  
  System.out("What are the amps:");
  
  int amps = nextInt();
  
  I = (V + 0.0) / R;
  
  System.out.println(I);
  }
}


//  Exersise 4 

public class SubStringExample{
   public static void main(String args[]) {
       String str= new String("Kelton is cool.");
       System.out.println("Substring starting from index 15:");
       System.out.println(str.substring(15));
       System.out.println("Substring starting from index 15 and ending at 20:");
       System.out.println(str.substring(15, 20));
   }
}

// Exersise 5




      
      
      
    
