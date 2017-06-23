package com.amazon.practice.park;

public class Car {
	private String name;
	private Space space;

	public Car(String name) {
		this.name = name;
		this.space = null;
	}

	public String getName() {
		return name;
	}

	public Space getSpace() {
		return space;
	}

	public void setSpace(Space space) {
		this.space = space;
	}

	public String toString() {
		return new StringBuffer("Car(name:").append(this.name).append(",space:").append(this.space).append(")").toString();
	}
}
