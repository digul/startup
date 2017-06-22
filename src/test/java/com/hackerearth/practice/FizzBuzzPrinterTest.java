package com.hackerearth.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzPrinterTest {

  @Test(timeout = 1000)
  public void test() {
    FizzBuzzPrinter tester = new FizzBuzzPrinter(15);
    assertEquals(tester.maxNum, 15);

    FizzBuzzPrinter tester2 = new FizzBuzzPrinter(3, 5);
    assertEquals(tester2.getFizz(), 3);
    assertEquals(tester2.getBuzz(), 5);

    for (int i = 1; i <= tester.maxNum; i++) {
      System.out.println(tester.testNumber(i));
    }

  }

}
