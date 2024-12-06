import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// Create Scanner Object
		Scanner scnObj = new Scanner(System.in);
		
		System.out.println("Welcome to Dice Game!");
		
		// Spacer
		System.out.println();

		// Prompt user for num sides
		System.out.print("Enter number of sides on die: ");
		int numSides = scnObj.nextInt();
		
		// Prompt user for num players
		System.out.print("Enter number of players: ");
		int numPlayers = scnObj.nextInt();
		
		// Clear Scanner and Spacer
		scnObj.nextLine();
		System.out.println();
		
		// Create player array with the given number of players
		Player[] players = new Player[numPlayers];
		
		// Loop through array and create new player and dice to store in array
		for (int i = 0; i < players.length; i++) {
			System.out.print("Enter player " + (i + 1) + " name: ");
			String playerName = scnObj.nextLine();
			players[i] = new Player(playerName, new Die(numSides));
		}
		
		// Spacer
		System.out.println();
		
		// Loop through the players and roll die, then print output
		for (Player player: players) {
			player.getDie().roll();
			System.out.printf("%s rolled a %d on a %d sided die.\n",
				player.getName(),
				player.getDie().getValue(),
				player.getDie().getNumSides()
			);
		}
		
		// Spacer
		System.out.println();
		
		// Create a new List of winners returned from decideWinner method
		List<Player> winners = decideWinner(players);
		
		// Capture if only 1 player won
		if (winners.size() == 1) {
			System.out.printf("%s won the game", winners.getFirst().getName());
		}
		
		// Capture if multiple players won
		if (winners.size() > 1) {
			StringBuilder strBld = new StringBuilder();
			for (int i = 0; i < winners.size(); i++) {
				if (i == 0) {
					strBld.append(winners.getFirst().getName());
				}
				else if (i == winners.size() - 1) {
					strBld.append(", and ").append(winners.getLast().getName()).append(" won the game");
				}
				else {
					strBld.append(", ").append(winners.get(i).getName());
				}
			}
			strBld.toString();
			System.out.println(strBld);
		}
	}
	
	public static List<Player> decideWinner(Player[] players) {
		int maxRoll = 1;
		List<Player> winners = new ArrayList<Player>();
		
		// Loops through players and finds max value
		for (Player player: players) {
			if (player.getDie().getValue() > maxRoll) {
				maxRoll = player.getDie().getValue();
			}
		}
		
		// Loops through all players and if their roll is equal to the max value, consider them a winner
		for (Player player: players) {
			if (player.getDie().getValue() == maxRoll) {
				winners.add(player);
			}
		}
		
		return winners;
	}
}
