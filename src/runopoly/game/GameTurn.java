package runopoly.game;

import java.util.ArrayList;

import runopoloy.board.Board;
import runopoloy.board.Space;
import runopoly.enums.SpaceType;
import runopoly.gamepieces.Dice;

public class GameTurn {
	
	public boolean runTurn (Player player, Board board)
	{
		boolean hasGameWinner = false;
		Dice dice = new Dice();
		int move = dice.rollDice();
		int newPlayerLocation = player.getLocation() + move;
		player.setLocation(newPlayerLocation);
		
		//get space information
		Space space = new Space();
		space = board.getListOfSpaces().get(newPlayerLocation);
		SpaceType spaceType = space.getSpaceType();
		switch (spaceType) {
		case PROPERTY:
			//if not owned- player purchases
			//System.out.println("Player" + player.getName() "has purchased ....")
			//if owned player pays owner
			System.out.println("Player" + player.getPlayerName() +"owes rent of ....");
			break;
		case GO:
			//increase player's money by 200
			System.out.println("Player " + player.getPlayerName() +"landed on GO and gained $200.");
			break;
		case CHEST:
			
			break;
		case TAXINCOME:
			//decrease player's money by 10 percent
			System.out.println("Player" + player.getPlayerName() +"landed on Income Tax Lost 10 Percent of Total Fame.")
 		break;
		case RAILROAD:
			//if not owned- Player purchases
			//System.out.println("Player" + player.getName() "Purchased a gym.")
			//else owned and player pays owner
			System.out.println("Player" + player.getPlayerName() +"Paid player.getOwner 25 Fame.");
			break;
		case CHANCE:
			break;
		case JAIL:
			//player lands in physical therapy
			//System.out.println("Player" + player.getName() "has landed in physical therapy.")
			break;
		case UTILITY:
			//if not owned- Player purchases
			//System.out.println("Player" + player.getName() "Purchased a track.")
			//else owned and player pays owner
			//System.out.println("Player" + player.getName() "Paid player.getOwner 25 Fame.")
			break;
		case FREEPARKING:
			//System.out.println("Player" + getName() "Has landed in a rest zone."
			break;
		case TAXLUXURY:
			//player pays 200 fame points
			//System.out.println("Player" + player.getName() "loses 200 fame")
			break;
		case GOTOJAIL:
			//player lands in GOTOJAIL move location to PT
			//System.out.println("Player" player.getName() "hurt themselves and is going to physical therapy.")
			break;		

		default:
			break;
		}
		
		return hasGameWinner;
		
	}
	
	public boolean hasGameWinner(ArrayList<Player> listOfPlayers)
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
		
		if (numOfBankrupt==(numOfPlayers-1))
		{
			hasGameWinner=true;
		}
	
		return hasGameWinner; 
	}

}
