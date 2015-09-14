package runopoly.game;

import java.util.ArrayList;
import java.util.List;

import runopoloy.board.Board;
import runopoloy.board.Space;
import runopoly.enums.PlayerToken;

public class GameSetup {

	private static int INITIAL_FAME = 1500;
	private static int INITIAL_LOCATION = 0;
	
	public GameSetup()
	{
		this.getClass();
	}
	
	public ArrayList<Player> initializePlayers(int numOfPlayers)
	{
		ArrayList<Player> listOfPlayers = new ArrayList<>();
		int i; 
		for (i=0;i<=(numOfPlayers-1);i++)
		{ 
			Player player = new Player();
			player.setPlayerNumber(i);
			player.setFame(INITIAL_FAME);
			player.setLocation(INITIAL_LOCATION);
			listOfPlayers.add(player);
			switch (i)
			{
			case 0:
				player.setPlayerName(PlayerToken.SAM.getName());
				break;
			case 1:
				player.setPlayerName(PlayerToken.STEVE.getName());
				break;
			case 2:
				player.setPlayerName(PlayerToken.BOLT.getName());
				break;
			case 3:
				player.setPlayerName(PlayerToken.PRE.getName());
				break;
			case 4:
				player.setPlayerName(PlayerToken.BANNISTER.getName());
				break;
			case 5:
				player.setPlayerName(PlayerToken.FLORENCE.getName());
				break;
			}
		}
		return listOfPlayers;
	}
	
	public Board initializeBoard()
	{
		Board board = new Board();
		ArrayList<Space> listOfSpaces = new ArrayList<>();
		listOfSpaces = board.createListOfInitSpaces();
		//shuffle deck
		System.out.println("Board has been initialized.\n");
		return board;
		
	}
	
	
	
}
