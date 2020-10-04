public class SubStringExample{
   public static void main(String args[]) {
       String str= new String("Kelton is cool.");
       System.out.println("Substring starting from index 15:");
       System.out.println(str.substring(15));
       System.out.println("Substring starting from index 15 and ending at 20:");
       System.out.println(str.substring(15, 20));
   }
}
