package se.stil.models;

import java.time.Instant;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Violation {
	
	@Id
	@GeneratedValue
	private long id;
	
	private long playerId;
	
	private long fineId;
	
	private Instant date;

	public Violation() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPlayerId() {
		return playerId;
	}

	public void setPlayerId(long playerId) {
		this.playerId = playerId;
	}

	public long getFineId() {
		return fineId;
	}

	public void setFineId(long fineId) {
		this.fineId = fineId;
	}

	public Instant getDate() {
		return date;
	}

	public void setDate(Instant date) {
		this.date = date;
	}
	
	
}
