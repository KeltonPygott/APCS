rt java.util.Random;
import java.util.Scanner;

public class SnakeEyes {

    public static void main(String[] args) {

    boolean loss = false; 

    int snakeEyes = 2 ;

    int max = 6;

    while (!loss) {

    System.out.println("The dice are rolling...");


    Random randomDice1 = new Random();
   
    int dice1 = randomDice1.nextInt(max); 

    Random randomDice2 = new Random();

    int dice2 = randomDice2.nextInt(max);

    int playerScore = dice1 + dice2; 

    int finalScore = 
    
    System.out.println("The score is " + playerScore); 


     if (playerScore == snakeEyes) {


    System.out.println("The simulation is over.");
    loss = true;
     
     }


    }





    



    }
}
