import org.junit.Assert;
import org.junit.Test;

public class EnumTest {

	@Test
	public void testColorValues()
	{
		Color col = null;
		
		//RED:
		col = Color.RED;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
		
		//GREEN:
		col = Color.GREEN;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getB());
		
		//BLUE:
		col = Color.BLUE;
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getR());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 0, col.getG());
		Assert.assertEquals("Incorrect rgb value in color " + col.name(), 255, col.getB());
	}
	
	@Test
	public void testLocation()
	{
		Assert.assertEquals("Location enum values incorrect.", Location.KITCHEN, Location.valueOf("KITCHEN"));
		Assert.assertEquals("Location enum values incorrect.", Location.CONSERVATORY, Location.valueOf("CONSERVATORY"));
		Assert.assertEquals("Location enum values incorrect.", Location.DINING_ROOM, Location.valueOf("DINING_ROOM"));
		Assert.assertEquals("Location enum values incorrect.", Location.BALLROOM, Location.valueOf("BALLROOM"));
		Assert.assertEquals("Location enum values incorrect.", Location.STUDY, Location.valueOf("STUDY"));
		Assert.assertEquals("Location enum values incorrect.", Location.HALL, Location.valueOf("HALL"));
		Assert.assertEquals("Location enum values incorrect.", Location.LOUNGE, Location.valueOf("LOUNGE"));
		Assert.assertEquals("Location enum values incorrect.", Location.LIBRARY, Location.valueOf("LIBRARY"));
		Assert.assertEquals("Location enum values incorrect.", Location.BILLIARD_ROOM, Location.valueOf("BILLIARD_ROOM"));
	}
	
	@Test
	public void testShapeToString()
	{
		Assert.assertEquals("Shape toString incorrect.", "thimble", Shape.THIMBLE.toString());
		Assert.assertEquals("Shape toString incorrect.", "boot", Shape.BOOT.toString());
		Assert.assertEquals("Shape toString incorrect.", "racecar", Shape.RACECAR.toString());
	}
	
	@Test
	public void testGamePiece()
	{	
		Assert.assertEquals("GamePiece get shape incorrect.", GamePiece.BLUE_BOOT.getShape(), Shape.BOOT);
		Assert.assertEquals("GamePiece get color incorrect.", GamePiece.BLUE_BOOT.getColor(), Color.BLUE);
	}
	
	
	@Test
	public void testGamePieceToString()
	{
		Assert.assertEquals("GamePiece toString incorrect.", GamePiece.BLUE_BOOT.toString(), "BLUE_BOOT: a blue boot with priority 5");
	}
	
	
	
}
