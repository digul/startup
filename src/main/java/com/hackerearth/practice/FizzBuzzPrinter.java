package com.hackerearth.practice;

public class FizzBuzzPrinter {
  public int maxNum = 100;
  private int fizz = 3;
  private int buzz = 5;
  private final String FIZZ_STR = "Fizz";
  private final String BUZZ_STR = "Buzz";

  public FizzBuzzPrinter(int maxNum) {
    this.maxNum = maxNum;
  }

  public FizzBuzzPrinter(int fizz, int buzz) {
    this.fizz = fizz;
    this.buzz = buzz;
  }

  public int getFizz() {
    return this.fizz;
  }

  public int getBuzz() {
    return this.buzz;
  }

  public String getFizzStr() {
    return this.FIZZ_STR;
  }

  public String getBuzzStr() {
    return this.BUZZ_STR;
  }

  public String testNumber(int i) {
    StringBuffer sb = new StringBuffer();
    if (i % this.fizz == 0) {
      sb.append(this.FIZZ_STR);
    }
    if (i % this.buzz == 0) {
      sb.append(this.BUZZ_STR);
    }
    if (sb.length() == 0) {
      sb.append(i);
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    FizzBuzzPrinter printer = new FizzBuzzPrinter(3, 5);

    for (int i = 1; i <= printer.maxNum; i++) {
      System.out.println(printer.testNumber(i));
    }
  }

}
