# monopoly-onboarding
Repository for Monopoly Game

package monopoly.gamepieces;

public class Dice {

	private int dice1;
	private int dice2;
	
	public void PairOfDice(){
		
		roll();
	}
	

	public void roll() {

		// generate a random number between 1-6
		dice1 = (int) (Math.random() * 6) + 1;
		dice2 = (int) (Math.random() * 6) + 1;

	}

	public  int getDice1() {
		return dice1;
	}

	public int getDice2() {

		return dice2;
	}

	public int getTotal(){
		return dice1 + dice2;
	
	}
	

}
