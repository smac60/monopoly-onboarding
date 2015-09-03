package runopoly.game;

import java.util.ArrayList;
import java.util.List;

import runopoloy.board.Board;
import runopoloy.board.Space;

public class GameSetup {

	private static int INITIAL_FAME = 1500;
	private static int INITIAL_LOCATION = 0;
	
	public GameSetup()
	{
		this.getClass();
	}
	
	public List<Player> initializePlayers(int numOfPlayers)
	{
		List<Player> listOfPlayers = new ArrayList<>();
		for (int i=0;i==numOfPlayers;i++)
		{ 
			Player player = new Player();
			player.setPlayerNumber(i);
			player.setFame(INITIAL_FAME);
			player.setLocation(INITIAL_LOCATION);
			listOfPlayers.add(player);
		}
		return listOfPlayers;
	}
	
	public void initializeBoard()
	{
		Board board = new Board();
		ArrayList<Space> listOfSpaces = new ArrayList<>();
		listOfSpaces = board.createListOfInitSpaces();
		//shuffle deck
		
		
	}
	
	
	
}
