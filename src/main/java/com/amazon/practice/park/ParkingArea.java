package com.amazon.practice.park;

import java.util.PriorityQueue;

public class ParkingArea {
  public final int MAX_TRY = 10;

  private PriorityQueue<Space> spaceList;

  public ParkingArea(int maxSpace) {
    spaceList = new PriorityQueue<Space>();
    for (int i = 0; i < maxSpace; i++) {
      Space space = new Space(100 - i); // make space with distance
      spaceList.offer(space);
    }
  }

  public Space entry(Car car) {
    spaceList.peek().setCar(car);
    return spaceList.peek();
  }

  public Space exit(String carName) {
    for (Space space : spaceList) {
      if (carName.equals(space.getCar().getName())) {
        space.setCar(null);
        return space;
      }
    }
    return null;
  }

  public String getStatus() {
    StringBuffer sb = new StringBuffer();
    for (Space space : spaceList) {
      sb.append(space.toString()).append(" / ");
    }
    return sb.toString();
  }
}
