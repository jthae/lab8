import org.junit.Assert;
import org.junit.Test;

public class GamePieceAppearanceTest {
	
	@Test
	public void testGamePieceAppearance()
	{
		GamePieceAppearance a1 = new GamePieceAppearance(Color.CYAN, Shape.THIMBLE);
		GamePieceAppearance a2 = new GamePieceAppearance(Color.MAGENTA, Shape.RACECAR);
		
		Assert.assertEquals("gamePiece color incorrect.", a1.getColor(), Color.CYAN);
		Assert.assertEquals("gamePiece color incorrect.", a2.getColor(), Color.MAGENTA);
		Assert.assertEquals("gamePiece shape incorrect.", a1.getShape(), Shape.THIMBLE);
		Assert.assertEquals("gamePiece color incorrect.", a2.getShape(), Shape.RACECAR);
	}

}
