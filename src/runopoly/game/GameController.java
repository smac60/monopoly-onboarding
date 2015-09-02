package runopoly.game;

import runopoly.enums.GameState;

public class GameController {
	private int numberOfPlayers;
	private GameState gameState;
	
	public GameController()
	{
		gameState = GameState.GamePlaying;
		GameSetup gameSetup = new GameSetup();
		
	}

}
