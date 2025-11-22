import java.util.Locale;
import java.util.Scanner;
import java.util.Random;
public class PaperRockScissors {
    public static void main(String[] args){
        // Paper Rock Scissors Game
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String play = "yes";
        String playerChoice;
        String computerChoice;
        String[] choices={"paper","rock","scissors"};
        System.out.println("***********************************");
        System.out.println("Welcome to PAPER ROCK SCISSORS game!");
        System.out.println("***********************************");
        do{System.out.print("Enter you choice(paper,rock,scissors):");
            playerChoice = scanner.nextLine().toLowerCase();
            if(!playerChoice.equals("paper")&&
                    !playerChoice.equals("rock")&&!
                    playerChoice.equals("scissors")){
                System.out.println("Invalid Choice");
                continue;
            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer choice is "+computerChoice);
            if(computerChoice.equals(playerChoice)){
                System.out.println("it is a tie");
            }
            else if ((playerChoice.equals("paper")&& computerChoice.equals("rock"))||
                    (playerChoice.equals("rock")&&  computerChoice.equals("scissors"))||
                    (playerChoice.equals("scissors")&&  computerChoice.equals("paper"))){
                System.out.println("You win!");
            }
            {
                System.out.println("You lose!");
            }
            System.out.println("wanna play again?(yes/no)");
            play=scanner.next().toLowerCase();

        }while(play.equals("yes"));
        System.out.println("See you");











        }














    }

