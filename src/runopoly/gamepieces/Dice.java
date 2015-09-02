package runopoly.gamepieces;

public class Dice {
	private int maxValue = 0; 
	
	public Dice()
	{
		this.getClass(); 
	}

	public int rollDice()
	{
		int faceValue = 0;
		faceValue = (int)(Math.random()*maxValue +1);
		return faceValue; 
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
}
