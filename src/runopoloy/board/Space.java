package runopoloy.board;

import runopoly.enums.Colors;
import runopoly.enums.SpaceType;

public class Space {
	private int spaceNumber;
	private int numberHouses;
	private int numberHotels;
	private int numberPieces;
	private SpaceType spaceType;
	private int ownerPlayerNumber = 99;
	private Colors spaceColor;
	
	public Space()
	{
		this.getClass();
	}
	
	public int getSpaceNumber() {
		return spaceNumber;
	}

	public void setSpaceNumber(int spaceNumber) {
		this.spaceNumber = spaceNumber;
	}

	public int getNumberHouses() {
		return numberHouses;
	}

	public void setNumberHouses(int numberHouses) {
		this.numberHouses = numberHouses;
	}

	public int getNumberHotels() {
		return numberHotels;
	}

	public void setNumberHotels(int numberHotels) {
		this.numberHotels = numberHotels;
	}

	public int getNumberPieces() {
		return numberPieces;
	}

	public void setNumberPieces(int numberPieces) {
		this.numberPieces = numberPieces;
	}

	public SpaceType getSpaceType() {
		return spaceType;
	}

	public void setSpaceType(SpaceType spaceType) {
		this.spaceType = spaceType;
	}

	public int getOwnerPlayerNumber() {
		return ownerPlayerNumber;
	}

	public void setOwnerPlayerNumber(int ownerPlayerNumber) {
		this.ownerPlayerNumber = ownerPlayerNumber;
	}

	public Colors getSpaceColor() {
		return spaceColor;
	}

	public void setSpaceColor(Colors spaceColor) {
		this.spaceColor = spaceColor;
	}
	

}
