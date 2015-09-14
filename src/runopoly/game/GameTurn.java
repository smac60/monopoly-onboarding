package runopoly.game;

import java.util.ArrayList;

import runopoloy.board.Board;
import runopoloy.board.Space;
import runopoly.enums.SpaceType;
import runopoly.gamepieces.Dice;

public class GameTurn {
	
	public void runTurn (Player player, Board board)
	{
		boolean hasGameWinner = false;
		Dice dice = new Dice();
		int move = dice.rollDice();
		System.out.println("A " +move +" was rolled.");
		int newPlayerLocation = player.getLocation() + move;
		if (newPlayerLocation>39)
		{
			newPlayerLocation = newPlayerLocation-40;
		}
		player.setLocation(newPlayerLocation);
		System.out.println("" + player.getPlayerName() + " is on square number " +newPlayerLocation);
		
		//get space information
		Space space = new Space();
		space = board.getListOfSpaces().get(newPlayerLocation);
		SpaceType spaceType = space.getSpaceType();
		switch (spaceType) {
		case PROPERTY:
			//if not owned- player purchases
			if(space.getOwnerPlayerNumber() == 99 && player.getFame() > 200)
			{
				System.out.println("" + player.getPlayerName() + " uses fame to win a Race!");
				space.setOwnerPlayerNumber(player.getPlayerNumber());
				player.setFame(player.getFame()-200);
			} else if(space.getOwnerPlayerNumber() == player.getPlayerNumber())
			{
				player.setFame(player.getFame()+100);
				System.out.println("" + player.getPlayerName() + " revists their win, and enjoys seeing their name on the record board.");
			} else if(space.getOwnerPlayerNumber() != player.getPlayerNumber())
			{
				System.out.println("" + player.getPlayerName() + " ran in a race and did not break the previous record. Fame was lost.");
				player.setFame(player.getFame()-50);
			}
			break;
		case GO:
			player.setFame(player.getFame()+100);
			System.out.println("" + player.getPlayerName() +" gets an Endorsement Deal. Gain 100 fame!");
			break;
		case CHEST:
			break;
		case TAXINCOME:
			player.setFame(player.getFame()-100);
			System.out.println("" + player.getPlayerName() +" broke leg and lost 100 fame.");
 		break;
		case RAILROAD:
			player.setFame(player.getFame()-100);
			System.out.println("" + player.getPlayerName() + " uses fame to start a Globo Gym");
			//else owned and player pays owner
			//System.out.println("Player " + player.getPlayerName() +" used 100 fame to use gym.");
			break;
		case CHANCE:
			break;
		case JAIL:
			player.setFame(player.getFame()-500);
			System.out.println("" + player.getPlayerName() + " has landed in physical therapy and lost 500 fame");
			break;
		case UTILITY:
			player.setFame(player.getFame()-300);
			System.out.println("" + player.getPlayerName() + " uses fame to get into a track complex");
			//else owned and player pays owner
			//System.out.println("Player " + player.getPlayerName() + " uses 300 to use track");
			break;
		case FREEPARKING:
			System.out.println("" + player.getPlayerName() + " is taking a day off");
			break;
		case TAXLUXURY:
			player.setFame(player.getFame()-200);
			System.out.println("" + player.getPlayerName() + " pulls a muscle and loses 200 fame. Players fame is now " +player.getFame());
			break;
		case GOTOJAIL:
			player.setFame(player.getFame()-500);
			System.out.println("" + player.getPlayerName() + " pulls a muscle and is one the way to the physical therapist. Loses 500 fame.");
			break;		
		default:
			break;
			
	}
		System.out.println("Fame is now " +player.getFame());
	
		//return hasGameWinner;
		
	}	


}
