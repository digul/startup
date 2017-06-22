package com.hackerearth.practice;

import com.hackerearth.practice.exception.PracticeException;

public class DivisibleTester {
  private final long MAX_DIGIT = 999999L;
  private final long MAX_QUESTION = 999999L;

  private String numberFormedStr;
  private long questionCnt;

  public void setQuestionCnt(long cnt) throws Exception {
    if (cnt < 0) {
      throw new PracticeException("## division Number has to over 0");
    }
    if (cnt > MAX_QUESTION) {
      throw new PracticeException("## division Number has to under " + MAX_QUESTION);
    }

    this.questionCnt = cnt;
  }

  public long getQuestionCnt() {
    return this.questionCnt;
  }
}
