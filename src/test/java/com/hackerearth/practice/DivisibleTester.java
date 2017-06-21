package com.hackerearth.practice;

import com.hackerearth.practice.exception.PracticeException;

public class DivisibleTester {
  private final Long MAX_DIGIT = 999999L;
  private final Long MAX_QUESTION = 999999L;

  private String numberFormedStr;
  private Long questionCnt;

  public void setQuestionCnt(Long cnt) throws Exception {
    if (cnt < 0) {
      throw new PracticeException("## division Number has to over 0");
    }
    if (cnt > MAX_QUESTION) {
      throw new PracticeException("## division Number has to under " + MAX_QUESTION);
    }

    this.questionCnt = cnt;
  }

  public Long getQuestionCnt() {
    return this.questionCnt;
  }
}
