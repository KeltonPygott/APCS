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
