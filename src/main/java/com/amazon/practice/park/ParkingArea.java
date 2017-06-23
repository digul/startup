package com.amazon.practice.park;

import java.util.HashSet;
import java.util.PriorityQueue;

public class ParkingArea {
	public final int MAX_TRY = 10;

	private PriorityQueue<Space> spaceList;
	private HashSet<Car> parkedCars;

	public ParkingArea(int maxSpace) {
		spaceList = new PriorityQueue<Space>();
		parkedCars = new HashSet<Car>();
		for (int i = 0; i < maxSpace; i++) {
			Space space = new Space(100 - i); // make space with distance
			spaceList.offer(space);
		}
	}

	public Space entry(Car car) {
		Space space = spaceList.poll();
		car.setSpace(space);
		parkedCars.add(car);
		return space;
	}

	public Space exit(Car car) {
		spaceList.add(car.getSpace());
		parkedCars.remove(car);
		return car.getSpace();
	}

	public String getStatus() {
		StringBuffer sb = new StringBuffer("Spaces : ");
		for (Space space : spaceList) {
			sb.append(space.toString()).append(" / ");
		}
		sb.append("\nCars : ");
		for (Car car : parkedCars) {
			sb.append(car.toString()).append(" / ");
		}
		return sb.toString();
	}
}
