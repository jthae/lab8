
public enum Shape
{
	THIMBLE, BOOT, RACECAR;
	
	@Override
	public String toString()
	{
		switch(this)
		{
		case THIMBLE: return "thimble";
		case BOOT: return "boot";
		case RACECAR: return "racecar";
		default: throw new IllegalArgumentException();
		}
	}
}


