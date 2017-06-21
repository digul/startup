package com.hackerearth.practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.hackerearth.practice.DivisibleTester;

public class DivisibleTesterTest {

  @Test
  public void test() throws Exception {
    DivisibleTester tester = new DivisibleTester();

    tester.setQuestionCnt(10L);
    long num = tester.getQuestionCnt();
    assertEquals(10L, num);
  }

}
