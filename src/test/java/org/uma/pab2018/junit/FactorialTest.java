package org.uma.pab2018.junit;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.uma.pab2018.junit.Factorial;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

  private Factorial factorial;

  @Before
  public void init() {
    factorial = new Factorial();
  }

  @Test
  public void shouldFactorialOfZeroReturnOne() {
    int result = factorial.compute(0);
    int expectedResult = 1;

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldFactorialOfOneReturnOne() {
    int result = factorial.compute(1);
    int expectedResult = 1;

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldFactorialOfTwoReturnTwo() {
    int result = factorial.compute(2);
    int expectedResult = 2;

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldFactorialOfThreeReturnSix() {
    int result = factorial.compute(3);
    int expectedResult = 6;

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldFactorialOfFiveoReturn60() {
    int result = factorial.compute(5);
    int expectedResult = 120;

    assertEquals(expectedResult, result);
  }

  @Test (expected = RuntimeException.class)
  public void shouldFactorialOfANegativeNumberRaiseAnException() {
    factorial.compute(-1);
  }

  @After
  public void teardown() {
    factorial = null ;
  }
}
