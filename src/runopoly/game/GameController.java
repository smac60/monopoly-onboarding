package runopoly.game;

import java.util.Scanner;

import runopoly.enums.GameState;

public class GameController {
	private static int numberOfPlayers;
	private static GameState gameState;
	
	public static void main(String[] args)
	{
		try {
			numberOfPlayers = askForNumberOfPlayers();
		} catch (Exception e) {
			System.out.println("User did not enter an integer");
			e.printStackTrace();
		}
		
		gameState = GameState.GamePlaying;
		GameSetup gameSetup = new GameSetup();
		gameSetup.initializePlayers(numberOfPlayers);
		gameSetup.initializeBoard();
		
		//begins turns
		//for (turn.getHasWinner != true)
		{
			//list of players
			//begin at player 1
			//run turn for player 1
			//check win condition
		}
	}
	
	public static int askForNumberOfPlayers()
	{
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number of Players");
		num = scanner.nextInt();
		System.out.println("You entered the Number" +num);
		return num;
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

}
