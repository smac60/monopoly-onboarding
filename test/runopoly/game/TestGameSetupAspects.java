package runopoly.game;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import runopoloy.board.Board;
import runopoloy.board.Space;
import runopoly.enums.SpaceType;

public class TestGameSetupAspects {

	@Test
	public void testGameTokensOnGoAtGameStart() {
		List<Player> listOfPlayers = new ArrayList<>();
		GameSetup gameSetup = new GameSetup();
		listOfPlayers = gameSetup.initializePlayers(6);
		boolean didItFail = false;
		for (Player player: listOfPlayers)
		{
			int location = player.getLocation();
			if (location !=0)
			{
				didItFail=true;
			}
			
		}
		assertFalse(didItFail);
	}

	//okay, I'm good now
	//Thanks :)
	
	@Test
	public void testGameFameCorrectAtGameStart() {
		List<Player> listOfPlayers = new ArrayList<>();
		GameSetup gameSetup = new GameSetup();
		listOfPlayers = gameSetup.initializePlayers(6);
		boolean didItFail = false;
		for (Player player: listOfPlayers)
		{
			int fame = player.getFame();
			if (fame !=1500)
			{
				didItFail=true;
			}
			
		}
		assertFalse(didItFail);
		
	}
	
	@Test
	public void testExampleSpaceHasCorrectNumber()
	{
				
		
	}
	
	@Test
	public void testBoardCreatesFortySpaces()
	{
		boolean didItFail = false;
		Board board = new Board();
		board.createListOfInitSpaces();
		
		ArrayList<Space> listOfSpaces = new ArrayList<>();
		listOfSpaces = board.createListOfInitSpaces();
		
		if (listOfSpaces.size() != 40)
		{
			didItFail = true;
			System.out.println("The number of spaces is "+listOfSpaces.size());
		}
		
		assertFalse(didItFail);
		
	}
	
	@Test
	public void testIsFirstSpaceTypeGo()
	{
		boolean didItFail = false;
		Board board = new Board();
		board.createListOfInitSpaces();
		
		Space space = new Space();
		space = board.getListOfSpaces().get(0);
		if (space.getSpaceType() != SpaceType.GO)
		{
			didItFail = true;
		}
		
		assertFalse(didItFail);
	}
	
	

	
	
	
	
	
	
	
	
	
	
}
