import java.util.Scanner;

public class Delicatessen {
	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		String item, overnight;
		double price;
		double total_price;

		System.out.println("Enter your item:");
		item = input.nextLine();

		System.out.println("Enter the price of item:");
		price = input.nextDouble();

		System.out.println("Do you want overnight delivery? (Y/N): ");
		overnight = input.nextLine();

		if (overnight = = 'Y'){
			if (price < 10){
				price = price + 2 + 5;
				System.out.println("Your total for overnight delivery is: " + price);
			}else {
				price =  price + 3 + 5;
				System.out.println("Your total for overnight delivery is:  " + price);
			}
		} else {
			if (price < 10){
				price = price + 2;
				System.out.println("Your total for regular delivery is: " + price);
			}else {
				price =  price + 3;
				System.out.println("Your total for regular delivery is: " + price);
			}
		}

	}
}

//Example 1

import java.util.Scanner;

class MicrowaveOven

{

public static void main (String[] args)

{

int numItems;

int heatingTime;

Scanner scan = new Scanner( System.in );

System.out.println("Enter the number of items: ");

numItems = scan.nextInt();

System.out.println("Enter the heating time: " );

heatingTime = scan.nextInt();

if ( numItems == 1)

{

System.out.println("Heating time: " + heatingTime);

}

else if (numItems == 2) {



}

}

} 

// Example 2 

import java.util.Scanner;
public class FantasyGame {
final static int MAX_POINTS = 15;

public static void main(String[] args) {
System.out.println("Welcome to Kelton's Quest");
String characterName = null;
int strength = 100;
int health = 100;
int luck = 1000;
Scanner inpScan = new Scanner(System.in);

System.out.print("Enter the name of your character: ");
characterName = inpScan.nextLine();
do
{
System.out.print("Enter strength (1-10): ");
strength = inpScan.nextInt();
}
while (strength < 1 || strength > 10);
do
{
System.out.print("Enter health (1-10): ");
health = inpScan.nextInt();
}
while (health < 1 || health > 10);
do
{
System.out.print("Enter luck (1-10): ");
luck = inpScan.nextInt();
}
while (luck < 1 || luck > 10);

if (strength + health + luck > MAX_POINTS)
{
System.out.println("Max Points Reached:");
strength = 5;
health = 5;
luck = 5;
}
inpScan.close();

System.out.println(characterName + ", strength: " + Integer.toString(strength) + ", health: " + Integer.toString(health) + ", luck: " + Integer.toString(luck));
}
}

// Ex 3


import java.util.scanner
class Trash

{

public static void main (String[] args)

{

Scanner trash = new Scanner(System.in);
System.out.println("How much trash?:);
int trash = nextInt();
int total = 0 

if trash ( <= 200) 
  total+= 20
 else
 
 if trash (<= 200 + 100)
 total += 8 
 else
 }
 }
 
 Ex 4 
 
 // THe harder the lessons get the more trouble I have solving them .

