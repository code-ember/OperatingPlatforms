package gamingroom;

/**
 * A simple class to hold information about a player
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a player is
 * created.
 * </p>
 * @author coce@snhu.edu
 *
 */
public class Player extends Entity {
	
	/*
	 * Constructor with an identifier and name
	*/
	public Player(long id, String name) {
		super(id, name);
	}
	
	// Constructor with an identifier, name and team
	public Player(long id, String name, Team team) {
		super(id, name);
	}

	@Override
	public String toString() {
		return "Player [id=" + super.getId() + ", name=" + super.getName() + "]";
	}
}