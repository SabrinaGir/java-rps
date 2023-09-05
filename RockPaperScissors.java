import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        //Create array containing strings rock paper and scissors
        String[] rps = {"rock", "paper", "scissors"};

        //Get move from computer using Random
        String computerMove = rps[new Random().nextInt(rps.length)];

        //Create variables
        Scanner reader = new Scanner(System.in);
        String playerMove;

        //Get move from player
        while(true) {
            System.out.println("Please enter your move: (rock, paper, or scissors)");
            playerMove = reader.nextLine();   
            // Learned on this if statement that == does not work for strings in this case. instead, have to use equals() method
             if (playerMove.equals("rock") || playerMove.equals("paper") || playerMove.equals("scissors")) {
                break;
            }
            System.out.println("Sorry, " + playerMove + " is not allowed.");
        
            // System.out.println(Sorry, that move is not allowed.");  --  Used to troubleshoot why my while loop wasn't breaking
        }

        System.out.println("Computer move: " + computerMove);

        if (computerMove.equals(playerMove)) {
            System.out.println("The game was a tie!");
        }

        // Calculate whether you or the computer wins
        else if (playerMove.equals("rock")){
            if (computerMove.equals("paper")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("scissors")) {
                System.out.println("You win!");
            }
        }


        else if (playerMove.equals("scissors")){
            if (computerMove.equals("rock")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("paper")) {
                System.out.println("You win!");
            }
        }

        else if (playerMove.equals("paper")){
            if (computerMove.equals("scissors")) {
                System.out.println("You lose!");
            } else if (computerMove.equals("rock")) {
                System.out.println("You win!");
            }
        }

        else {
            System.out.println("Oops.");
        }

        


    }
    
}