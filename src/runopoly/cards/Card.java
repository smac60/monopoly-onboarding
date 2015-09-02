package runopoly.cards;

import runopoly.enums.CardType;

public class Card {
	private CardType cardType;
	private String cardName;
	private boolean isPayMoney;
	private boolean isGainMoney;
	private boolean isMovement; 
	
	public Card()
	{
		this.getClass();
	}

	public CardType getCardType() {
		return cardType;
	}

	public void setCardType(CardType cardType) {
		this.cardType = cardType;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public boolean isPayMoney() {
		return isPayMoney;
	}

	public void setPayMoney(boolean isPayMoney) {
		this.isPayMoney = isPayMoney;
	}

	public boolean isGainMoney() {
		return isGainMoney;
	}

	public void setGainMoney(boolean isGainMoney) {
		this.isGainMoney = isGainMoney;
	}

	public boolean isMovement() {
		return isMovement;
	}

	public void setMovement(boolean isMovement) {
		this.isMovement = isMovement;
	}
	
	

}
