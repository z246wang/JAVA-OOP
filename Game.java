package Lab4;

public class Game extends Player{
	
	private Player[] player;
	private Map map;
	
	public Game() {
		player = new Player[10];
	}

	public Game(Player[] player, Map map) {
		this.player = player;
		this.map = map;
	}
	
	public Game(Game game) {
		this.player = game.player;
		for (int i = 0; i < player.length; i++) {
			player[i] = new Player(player[i]);
		}
		this.map = game.map;
	}

	public static Game getInstance() {
		return new Game();
	}

	public static Game getInstance(Player[] player, Map map) {
		return new Game(player, map);
	}

	public static Game getInstance(Game game) {
		return new Game(game);
	}

	public Player[] getPlayer() {
		return this.player;
	}
	
	public Map getMap() {
		return this.map;
	}

	public void setPlayer(Player[] player) {
		this.player = player;
	}

	public void setMap(Map map) {
		this.map = map;
	}
}
/**
 * This class implements all a player requires to play in this game. 
 */
class Player{
	
	String name;
	Role role;
	
	public Player() {
		super();
		name = "";
		role = new Role();
	}
	
	public Player(String name, Role role) {
		super();
		this.name = name;
		this.role = role;
	}

	public Player(Player player) {
		super();
		this.name = player.name;
		this.role = player.role;
	}

	public static Player getInstance() {	
		return new Player();
	}

	public static Player getInstance(String name, Role role) {
		return new Player(name, role);
	}
	
	public static Player getInstance(Player player) {
		return new Player(player);
	}
	
	public String getName() {
		return name;
	}

	public Role getRole() {
		return role;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setRole(Role role) {
		this.role = role;
	}
}
/**
 * This class implements the areas in which players can play.
 */
class Map{
	
	String theSkeld;
    String miraHq;
    String polus;
	String airShip;
	
	public Map() {
		theSkeld = "";
		miraHq = "";
		polus = "";
		airShip = "";
	}
	
	public Map(String theSkeld, String miraHq, String polus, String airShip) {
		this.theSkeld = theSkeld;
		this.miraHq = miraHq;
		this.polus = polus;
		this.airShip = airShip;
	}

	public static Map getInstance() {
		return new Map();
	}
	
	public static Map getInstance(String theSkeld, String miraHq, String polus, String airShip) {
		return new Map(theSkeld, miraHq, polus, airShip);
	}

	public Map(Map map) {
		this.theSkeld = map.theSkeld;
		this.miraHq = map.miraHq;
		this.polus = map.polus;
		this.airShip = map.airShip;
	}
	
	public static Map getInstance(Map map) {
		return new Map(map);
	}
}
/**
 * This class presents the role of the players, 
 * which can be either imposter or crewmate. 
 *  Imposter role, gets the value of 'i'and 
 *  Cremate gets the value of 'c'
 */
class Role{
	
	char role;
	
	public Role() {
		role = ' ';
	}

	public Role(char role) {
		this.role = role;
	}
	
	public Role(Role role) {
		this.role = role.role;
	}
	
	public static Role getInstance() {
		return new Role();
	}

	public static Role getInstance(char role) {
		return new Role(role);
	}

	public static Role getInstance(Role role) {
		return new Role(role);
	}

	public char getRole() {
		return role;
	}

	public void setRole(char role) {
		this.role = role;
	}
}
