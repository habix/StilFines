package se.stil.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import se.stil.utils.util.POSITION;

public class Player {

	@Id
	@GeneratedValue
	private long id;
	
	@NotNull
	private String firstName;
	
	@NotNull
	private String lastName;
	
	private int playerNumber;
	
	private POSITION position;
	
	public Player() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(int playerNumber) {
		this.playerNumber = playerNumber;
	}

	public POSITION getPosition() {
		return position;
	}

	public void setPosition(POSITION position) {
		this.position = position;
	}
}
