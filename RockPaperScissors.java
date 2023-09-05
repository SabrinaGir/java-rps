import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        String[] rps = {"rock", "paper", "scissors"};
        String computerMove = rps[new Random().nextInt(rps.length)];

        Scanner scanner = new Scanner(System.in);
        String playerMove;

        while(true) {
        System.out.println("Please enter your move: (rock, paper, or scissors)");
        playerMove = scanner.nextLine();   
        if playerMove == "rock" || playerMove == "paper" || playerMove == "scissors" {
            break;
        }

        

        }


    }
    
}