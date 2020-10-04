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
    
