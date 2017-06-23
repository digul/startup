package com.amazon.practice.park;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ParkingAreaTest {

	@Test
	public void test() {
		ParkingArea parkArea = new ParkingArea(4);

		Car car1 = new Car("Matiz5290");
		Car car2 = new Car("ContryMan");
		Car car3 = new Car("SM5");
		Car car4 = new Car("MiniCoope");

		assertEquals(car4.getName(), "MiniCoope");

		// 입차
		System.out.println("enter : " + parkArea.entry(car1).toString());
		System.out.println(parkArea.getStatus());
		// 입차
		System.out.println("enter : " + parkArea.entry(car2).toString());
		System.out.println(parkArea.getStatus());
		// 입차
		System.out.println("enter : " + parkArea.entry(car3).toString());
		System.out.println(parkArea.getStatus());
		// 출차
		System.out.println("exit : " + parkArea.exit(car2).toString());
		System.out.println(parkArea.getStatus());
		// 입차
		System.out.println("enter : " + parkArea.entry(car4).toString());
		System.out.println(parkArea.getStatus());

	}

}
