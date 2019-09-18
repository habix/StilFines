package se.stil.models;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

public class Fine {
	
	@Id
	private long fineId;
	
	@NotNull
	private String violation;
	
	@NotNull
	private int amount;
	
	private String description;

	public Fine() {
	}

	public long getFineId() {
		return fineId;
	}

	public void setFineId(long fineId) {
		this.fineId = fineId;
	}

	public String getViolation() {
		return violation;
	}

	public void setViolation(String violation) {
		this.violation = violation;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
