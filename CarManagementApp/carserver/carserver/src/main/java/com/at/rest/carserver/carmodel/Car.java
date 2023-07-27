package com.at.rest.carserver.carmodel;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Car {
	@Id
	private int id;
	private String model;
	private int price;
	private String color;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(int id, String model, int price, String color) {
		super();
		this.id = id;
		this.model = model;
		this.price = price;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", price=" + price + ", color=" + color + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id, model, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(color, other.color) && id == other.id && Objects.equals(model, other.model)
				&& price == other.price;
	}
	
	
	

}
