import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class BoardGameTest {
	
	@Test
	public void testAddPlayer()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		
		Assert.assertEquals("AddPlayer method incorrect.", monopoly.getPlayers().size(), 2);
	}
	
	@Test
	public void testGetPlayerGamePiece()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		
		Assert.assertEquals("getPlayerGamePiece method incorrect.", monopoly.getPlayerGamePiece("Jaycie"), GamePiece.BLUE_BOOT);
		Assert.assertEquals("getPlayerGamePiece method incorrect.", monopoly.getPlayerGamePiece("Zach"), GamePiece.MAGENTA_RACER);
	}
	
	@Test
	public void testGetPlayerWithGamePiece()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		
		Assert.assertEquals("getPlayerWithGamePiece method incorrect.", monopoly.getPlayerWithGamePiece(GamePiece.BLUE_BOOT), "Jaycie");
		Assert.assertEquals("getPlayerWithGamePiece method incorrect.", monopoly.getPlayerWithGamePiece(GamePiece.MAGENTA_RACER), "Zach");
	}
	
	@Test
	public void testMovePlayer()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		monopoly.movePlayer("Jaycie", Location.HALL);
		monopoly.movePlayer("Zach", Location.CONSERVATORY);
		
		Assert.assertEquals("movePlayer incorrect.", monopoly.getPlayersLocation("Jaycie"), Location.HALL);
		Assert.assertEquals("movePlayer incorrect.", monopoly.getPlayersLocation("Zach"), Location.CONSERVATORY);
	}
	
	@Test
	public void testMoveTwoPlayers()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		String[] names = {"Jaycie", "Zach"};
		Location[] newLocations = {Location.STUDY, Location.BALLROOM};
		monopoly.moveTwoPlayers(names, newLocations);
		
		Assert.assertEquals("moveTwoPlayers incorrect.", monopoly.getPlayersLocation("Jaycie"), Location.STUDY);
		Assert.assertEquals("moveTwoPlayers incorrect.", monopoly.getPlayersLocation("Zach"), Location.BALLROOM);		
	}
	
	@Test
	public void testGetPlayersLocation()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		
		Assert.assertEquals("getPlayersLocation incorrect.", monopoly.getPlayersLocation("Jaycie"), Location.DINING_ROOM);
		Assert.assertEquals("getPlayersLocation incorrect.", monopoly.getPlayersLocation("Zach"), Location.LIBRARY);
	}
	
	@Test
	public void testGetPlayersAtLocation()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		monopoly.addPlayer("Anna", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		ArrayList<String> diningRoom = new ArrayList<String>();
		diningRoom.add("Jaycie");
		diningRoom.add("Anna");
		ArrayList<String> library = new ArrayList<String>();
		library.add("Zach");
		
		
		Assert.assertEquals("getPlayersAtLocation incorrect.", monopoly.getPlayersAtLocation(Location.DINING_ROOM), diningRoom);
		Assert.assertEquals("getPlayersAtLocation incorrect.", monopoly.getPlayersAtLocation(Location.LIBRARY), library);
	}
	
	@Test
	public void testGetGamePiecesAtLocation()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		monopoly.addPlayer("Anna", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		ArrayList<GamePiece> diningRoom = new ArrayList<GamePiece>();
		diningRoom.add(GamePiece.BLUE_BOOT);
		diningRoom.add(GamePiece.YELLOW_BOOT);
		ArrayList<GamePiece> library = new ArrayList<GamePiece>();
		library.add(GamePiece.MAGENTA_RACER);
		
		
		Assert.assertEquals("getGamePiecesAtLocation incorrect.", monopoly.getGamePiecesAtLocation(Location.DINING_ROOM), diningRoom);
		Assert.assertEquals("getGamePiecesAtLocation incorrect.", monopoly.getGamePiecesAtLocation(Location.LIBRARY), library);
	}
	
	@Test
	public void testGetPlayers()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		monopoly.addPlayer("Anna", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		
		Set<String> players = new HashSet<String>();
		players.add("Jaycie");
		players.add("Zach");
		players.add("Anna");
		
		Assert.assertEquals("getPlayers incorrect.", players, monopoly.getPlayers());
	}
	
	@Test
	public void testGetPlayerLocations()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		monopoly.addPlayer("Anna", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		
		Set<Location> locs = new HashSet<Location>();
		locs.add(Location.DINING_ROOM);
		locs.add(Location.LIBRARY);
		
		Assert.assertEquals("getPlayerLocations incorrect.", locs, monopoly.getPlayerLocations());	
	}
	
	@Test
	public void testGetPlayerPieces()
	{
		BoardGame monopoly = new BoardGame();
		monopoly.addPlayer("Jaycie", GamePiece.BLUE_BOOT, Location.DINING_ROOM);
		monopoly.addPlayer("Zach", GamePiece.MAGENTA_RACER, Location.LIBRARY);
		monopoly.addPlayer("Anna", GamePiece.YELLOW_BOOT, Location.DINING_ROOM);
		
		Set<GamePiece> pieces = new HashSet<GamePiece>();
		pieces.add(GamePiece.BLUE_BOOT);
		pieces.add(GamePiece.MAGENTA_RACER);
		pieces.add(GamePiece.YELLOW_BOOT);
		
		Assert.assertEquals("getPlayerPieces incorrect.", pieces, monopoly.getPlayerPieces());
	}

}
