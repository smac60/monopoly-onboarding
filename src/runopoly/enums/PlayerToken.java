package runopoly.enums;

public enum PlayerToken {

	SAM ("Sam Macaluso", 1),
	STEVE ("Stephen Kruse", 2),
	BOLT ("Usain Bolt", 3),
	PRE ("Steve Prefontaine", 4),
	//LIDDELL ("Eric Liddell"),
	BANNISTER ("Roger Bannister", 5),
	FLORENCE ("Florence Griffith-Joyner", 6);
	//SWITZER ("Katherine Switzer");
	
	private final String value;
	private final int num;
	
	private PlayerToken(String value,int num)
	{
		this.value = value;
		this.num = num;
	}
	
	public int getNumber()
	{
		return num;
	}
	
	public String getName()
	{
		return value;
	}
	
	public static PlayerToken getRandomToken()
	{
		return values() [(int) (Math.random()*values().length)];
	}
}
