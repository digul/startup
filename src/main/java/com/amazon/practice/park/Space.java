package com.amazon.practice.park;

public class Space implements Comparable<Space> {
  private Car car;
  private int distance;

  public Space(int distance) {
    this.distance = distance;
    this.car = null;
  }


  public void setCar(Car car) {
    this.car = car;
  }

  public Car getCar() {
    return car;
  }

  public int getDistance() {
    return distance;
  }


  @Override
  public int compareTo(Space target) {
    if (target.car != null && this.car != null) {
      return 0;
    }
    if (this.car != null) {
      return 1;
    }
    if (target.car != null) {
      return -1;
    }
    if (this.distance > target.distance) {
      return 1;
    }
    if (this.distance < target.distance) {
      return -1;
    }
    return 0;
  }

  public String toString() {
    StringBuffer result = new StringBuffer("Space(");
    result.append("distance ").append(this.distance).append(") : ");
    if (this.car == null) {
      result.append("(empty");
    } else {
      result.append("Car(");
      result.append(this.car.getName());
    }
    return result.append(")\n").toString();
  }
}
