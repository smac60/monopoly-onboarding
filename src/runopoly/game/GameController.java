package runopoly.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import runopoloy.board.Board;
import runopoly.enums.GameState;
import runopoly.enums.PlayerToken;

public class GameController {
	private static int numberOfPlayers;
	private static GameState gameState;
	//private static 
	
	public static void main(String[] args)
	{
		System.out.println("--------------------------------------------");
		System.out.println("Welcome to Runopoly!");			
		
		try {
			numberOfPlayers = askForNumberOfPlayers();
		} catch (Exception e) {
			System.out.println("User did not enter an integer");
			e.printStackTrace();
		}
		
		if (numberOfPlayers == 6010)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Game Over");			
			System.out.println("Sam Macaluso wins and breaks all of the world records.  He becomes president of the world. And he wins Runopoly!" );
		} else if (numberOfPlayers == 5501)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Game Over");			
			System.out.println("Stephen Kruse wins the Olympics. The whole thing. And he wins Runopoloy!");
		} else if (numberOfPlayers == 4607)
		{
			System.out.println("--------------------------------------------");
			System.out.println("Game Over");			
			System.out.println("Baylor beats SMU tonight!");
		}
		else if (numberOfPlayers >1 && numberOfPlayers <7)
		{				
			gameState = GameState.GamePlaying;
			GameSetup gameSetup = new GameSetup();
			
			ArrayList<Player> listOfPlayers = new ArrayList<>();
			listOfPlayers = gameSetup.initializePlayers(numberOfPlayers);
			
			//setPlayerNames(listOfPlayers);
			
			Board board = new Board();
			board = gameSetup.initializeBoard();
			
			GameTurn turn = new GameTurn();		
			boolean hasGameWinner = hasGameWinner(listOfPlayers);
					
			while (hasGameWinner == false)
			{
				//System.out.println("There are " + listOfPlayers.size() +" players.");
				for (Player player: listOfPlayers)
				{
					if (hasGameWinner == false)
					{
						if (player.getIsBankrupt()==false)
						{
						System.out.println("\nIt is Player " + player.getPlayerNumber() +"'s turn.");
						turn.runTurn(player, board);
						}
						hasGameWinner = hasGameWinner(listOfPlayers);
					}
				}
				//System.out.println("Game Turn is Running.\n");
				//hasGameWinner = hasGameWinner(listOfPlayers);
			}
		}
		else
		{
			System.out.println("\nYou entered an incorrect number of players. Please restart Game.");
		}
	}
	
	public static int askForNumberOfPlayers()
	{
		int num;
		Scanner scanner = new Scanner(System.in);
		System.out.println("This Game can be played by 2-6 players. ");
		System.out.println("Please Enter the Number of Players:");
		num = scanner.nextInt();
		System.out.println("You entered the Number " +num);
		return num;
	}
	
//	public static void setPlayerNames(ArrayList<Player> listOfPlayers)
//	{
//		List<PlayerToken> listOfNames = new ArrayList<>();
//		for(Player player : listOfPlayers)
//		{
//			PlayerToken token = PlayerToken.getRandomToken();
//			while (!listOfNames.contains(token))
//			{
//				token = PlayerToken.getRandomToken();
//				listOfNames.add(token);
//			}
//			player.setPlayerName(token.getName());
//		}
//	}
			
	public static boolean hasGameWinner(ArrayList<Player> listOfPlayers)
	{
		boolean hasGameWinner = false;
		int numOfBankrupt = 0;
		int numOfPlayers = listOfPlayers.size();
		
		for (Player player: listOfPlayers)  
		{
			boolean isBankrupt = player.getIsBankrupt();
			if (isBankrupt==true)
			{
				numOfBankrupt++;
			}
		}		
		if (numOfBankrupt==(numOfPlayers-1) || numOfBankrupt ==(numOfPlayers))
		{
			hasGameWinner=true;
			System.out.println();
			System.out.println("--------------------------------------------");
			System.out.println("Game Over");			
			for(Player player:listOfPlayers)
			{
				if (player.getFame()<=0)
					{
					System.out.println("" +player.getPlayerName() +" is no longer famous. All their records are revoked due to illegal steroid use.");
					}
				else
				{
					System.out.println("" +player.getPlayerName() +" has " +player.getFame() +" fame left and retires in the Bahamas in glory and Power! You can see their face on every Gatorade bottle.");
				}
			}
			System.out.println("--------------------------------------------");
		}
		return hasGameWinner; 
	}

	public int getNumberOfPlayers() {
		return numberOfPlayers;
	}

	public void setNumberOfPlayers(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}

}
