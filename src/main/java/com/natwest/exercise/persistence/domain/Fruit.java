package com.natwest.exercise.persistence.domain;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Fruit {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long Id;

	@Column
	private String type;

	private int amount;

	private String colour;

	public Fruit() {
		super();

	}

	public Fruit(String type, int amount, String colour) {
		super();
		this.type = type;
		this.amount = amount;
		this.colour = colour;

	}

	public Fruit(Long id, String type, int amount, String colour) {
		super();
		Id = id;
		this.type = type;
		this.amount = amount;
		this.colour = colour;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Fruit [Id=" + Id + ", type=" + type + ", amount=" + amount + ", colour=" + colour + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(Id, amount, colour, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruit other = (Fruit) obj;
		return Objects.equals(Id, other.Id) && amount == other.amount && Objects.equals(colour, other.colour)
				&& Objects.equals(type, other.type);
	}
}
