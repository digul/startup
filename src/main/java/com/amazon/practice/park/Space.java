package com.amazon.practice.park;

public class Space implements Comparable<Space> {
	private int distance;

	public Space(int distance) {
		this.distance = distance;
	}

	public int getDistance() {
		return distance;
	}

	@Override
	public int compareTo(Space target) {
		if (this.distance > target.distance) {
			return 1;
		}
		if (this.distance < target.distance) {
			return -1;
		}
		return 0;
	}

	public String toString() {
		return new StringBuffer("Space(distance : ").append(this.distance).append(")").toString();
	}
}
