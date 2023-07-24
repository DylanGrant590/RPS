import java.util.Scanner;
import java.util.Random;
public class RPS {

	public static void main(String[] args) {
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String[] options = {"rock", "paper", "scissors"};
		String computer = options[random.nextInt(options.length)];
		String move;
		
		while(true) {
			System.out.println("Please enter your move (rock, paper, scissors):");
			move = scanner.nextLine();
			if(move.equals("rock") || move.equals("paper") || move.equals("scissors")) {
				break;
			}else {
				System.out.println(move + " is not a valid option.");
			}
		}
		System.out.println("\nComputer played " + computer + ".");
		if(move.equals(computer)) {
			System.out.println("\nThe game is tied!");
		}
		else if (move.equals("rock")) {
			if (computer.equals("paper")) {
				System.out.println("You lose!");
			}
			else if (move.equals("rock")) {
				if (computer.equals("paper")) {
					System.out.println("\nYou lose!");
				}
				else if (computer.equals("scissors")) {
					System.out.println("\nYou win!");
				}
			}
			System.out.println("\nDo you want to play again? (yes, no)");
			String play = scanner.nextLine();
			scanner.close();
			
			if(!play.equals("yes")) {
				System.exit(0);
			}
		}
	}
}