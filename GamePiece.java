
public enum GamePiece {
	
	RED_RACER(new GamePieceAppearance(Color.RED, Shape.RACECAR), 0),
	BLUE_RACER(new GamePieceAppearance(Color.BLUE, Shape.RACECAR), 2),
	MAGENTA_RACER(new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR), 1),
	RED_THIMBLE(new GamePieceAppearance(Color.RED, Shape.THIMBLE), 10),
	BLUE_BOOT(new GamePieceAppearance(Color.BLUE, Shape.BOOT), 5),
	GREEN_BOOT(new GamePieceAppearance(Color.GREEN, Shape.BOOT), 8),
	YELLOW_BOOT(new GamePieceAppearance(Color.YELLOW, Shape.BOOT), 10);
	
	private GamePieceAppearance appearance;
	private int priority;
	
	GamePiece(GamePieceAppearance appearance, int priority)
	{
		this.appearance = appearance;
		this.priority = priority;
	}
	
	public Color getColor()
	{
		return appearance.getColor();
	}
	
	public Shape getShape()
	{
		return appearance.getShape();
	}
	
	private int getPriority()
	{
		return priority;
	}
	
	public static GamePiece movesFirst(GamePiece a, GamePiece b)
	{
		if(a.getPriority() > b.getPriority())
		{
			return b;
		}
		else if(a.getPriority() < b.getPriority())
		{
			return a;
		}
		else
		{
			return a;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format("%s: a %s %s with priority %d", this.name(), appearance.getColor(), appearance.getShape(), priority);
	}

}
