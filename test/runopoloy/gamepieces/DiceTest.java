package runopoloy.gamepieces;

import static org.junit.Assert.*;
import org.junit.Test;

import runopoly.gamepieces.Dice;

public class DiceTest {
	Dice dice = new Dice();
	int result;
	
	@Test
	public void testDiceResultIsBetweeMinAndMax()
	{
		dice.setMaxValue(6);
		result = dice.rollDice();
		boolean isWithinRange = isResultWithinMinAndMax(result);
		assertTrue(isWithinRange);
		//fail("Not yet implemented");
	}
	
	@Test
	public void testDiceReturnsRandomNumber()
	{
		dice.setMaxValue(6);
		int [] resultSet; 
		for(int i = 0; i<=10; i++)
		{
			result = dice.getMaxValue();
			
		}
	}
	
	public boolean isResultWithinMinAndMax(int result)
	{
		boolean returnValue=false;
		int max = dice.getMaxValue();
		if (result>=1 && result<=max)
		{
			returnValue = true;
		}
		return returnValue;
		
		//Assert.assertEuqlas("Die does Not defaul to 6 faced die", 6, die.getnumber ofFAces); Derrick's example
	}
	

}
