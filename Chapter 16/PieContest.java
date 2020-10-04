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
