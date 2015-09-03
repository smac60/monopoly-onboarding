package runopoloy.board;

import java.util.*;

import runopoly.enums.SpaceType;

public class Board {
	String spaceType;
	ArrayList<Space> listOfSpaces = new ArrayList<>();
	ArrayList<SpaceType> listOfSpaceType = new ArrayList<>();
	
	public Board()
	{
		this.getClass();
		listOfSpaceType.add(SpaceType.GO);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.CHEST);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.TAXINCOME);
		listOfSpaceType.add(SpaceType.RAILROAD);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.CHANCE);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.JAIL);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.UTILITY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.RAILROAD);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.CHEST);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.FREEPARKING);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.CHANCE);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.RAILROAD);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.UTILITY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.GOTOJAIL);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.CHEST);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.RAILROAD);
		listOfSpaceType.add(SpaceType.CHANCE);
		listOfSpaceType.add(SpaceType.PROPERTY);
		listOfSpaceType.add(SpaceType.TAXLUXURY);
		listOfSpaceType.add(SpaceType.PROPERTY);
	}
	
	public ArrayList<Space> createListOfInitSpaces()
	{
		ArrayList<Space> listOfSpaces = new ArrayList<>();
		for (int i = 0; i<=39;i++)
		{
			//System.out.println("loop variable is " +i);
			Space space = new Space();
			space.setSpaceNumber(i);
			space.setSpaceType(listOfSpaceType.get(i));
			listOfSpaces.add(space);
			//System.out.println("The number of spaces in Board is "+listOfSpaces.size());
			
		}
		
		this.setListOfSpaces(listOfSpaces);
		return listOfSpaces;
	}

	
	public ArrayList<Space> getListOfSpaces() {
		return listOfSpaces;
	}

	public void setListOfSpaces(ArrayList<Space> listOfSpaces) {
		this.listOfSpaces = listOfSpaces;
	}

	public ArrayList<SpaceType> getListOfSpaceType() {
		return listOfSpaceType;
	}

	public void setListOfSpaceType(ArrayList<SpaceType> listOfSpaceType) {
		this.listOfSpaceType = listOfSpaceType;
	}
	
	
}