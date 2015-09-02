package monopoly.game;

public class Player {
	private int location = 0;
	private String playerName;
	private int fame = 1500;
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public int getFame() {
		return fame;
	}
	public void setFame(int fame) {
		this.fame = fame;
	}

	

}
