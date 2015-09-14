package runopoly.gamepieces;

public class Dice {
	private int maxValue = 6; 
	
	public Dice()
	{
		this.getClass(); 
	}

	public int rollDice()
	{
		int faceValue;
		faceValue = (int)(Math.random()*maxValue) +1;
		return faceValue; 
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
}
