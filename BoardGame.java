import java.util.LinkedHashMap;
import java.util.Set;
import java.util.ArrayList;
import java.util.HashSet;


public class BoardGame {
	
	protected LinkedHashMap<String, GamePiece> playerPieces;
	
	protected LinkedHashMap<String, Location> playerLocations;
	
	public BoardGame()
	{
		playerPieces = new LinkedHashMap<String, GamePiece>();
		playerLocations = new LinkedHashMap<String, Location>();
	}
	
	public boolean addPlayer(String playerName, GamePiece gamePiece, Location initialLocation)
	{
		if(!playerPieces.values().contains(gamePiece))
		{
			playerPieces.put(playerName, gamePiece);
			playerLocations.put(playerName, initialLocation);
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public GamePiece getPlayerGamePiece(String playerName)
	{
		return playerPieces.get(playerName);
	}
	
	public String getPlayerWithGamePiece(GamePiece gamePiece)
	{
		for(String playerName : playerPieces.keySet())
		{
			if(playerPieces.get(playerName).equals(gamePiece))
			{
				return playerName;
			}
		}
		return null;
	}
	
	public void movePlayer(String playerName, Location newLocation)
	{
		playerLocations.replace(playerName, newLocation);
	}
	
	public String[] moveTwoPlayers(String[] playerNames, Location[] newLocations)
	{
		
		String[] result = new String[2];
		
		GamePiece p1 = playerPieces.get(playerNames[0]);
		GamePiece p2 = playerPieces.get(playerNames[1]);
		
	
		GamePiece first = GamePiece.movesFirst(p1, p2);
		
		if(first.equals(p1))
		{
		
			result[0] = playerNames[0];
			movePlayer(playerNames[0], newLocations[0]);
			
			result[1] = playerNames[1];
			movePlayer(playerNames[1], newLocations[1]);
			
			
		}
		else
		{
			result[0] = playerNames[1];
			movePlayer(playerNames[1], newLocations[1]);
			
			result[1] = playerNames[0];
			movePlayer(playerNames[0], newLocations[0]);	
		}
		
		return result;
	}
	
	public Location getPlayersLocation(String player)
	{
		return playerLocations.get(player);
	}
	
	public ArrayList<String> getPlayersAtLocation(Location loc)
	{
		ArrayList<String> playersAt = new ArrayList<String>();
		
		for(String playerName : playerLocations.keySet())
		{
			if(playerLocations.get(playerName) == loc)
			{
				playersAt.add(playerName);
			}
		}
		
		return playersAt;
	}
	
	public ArrayList<GamePiece> getGamePiecesAtLocation(Location loc)
	{
		ArrayList<GamePiece> pieces = new ArrayList<GamePiece>();
		
		for(String name : playerPieces.keySet())
		{
			if(playerLocations.get(name) == loc)
			{
			pieces.add(playerPieces.get(name));
			}
		}
		return pieces;

	}
	
	public Set<String> getPlayers()
	{
		return playerPieces.keySet();
	}
	
	public Set<Location> getPlayerLocations()
	{
		Set<Location> locations = new HashSet<Location>();
		
		locations.addAll(playerLocations.values());
	
		return locations;
	}
	
	public Set<GamePiece> getPlayerPieces()
	{
		Set<GamePiece> pieces = new HashSet<GamePiece>();
		
		pieces.addAll(playerPieces.values());
		
		return pieces;	
	}
	

}
