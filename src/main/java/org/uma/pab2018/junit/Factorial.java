package org.uma.pab2018.junit;

public class Factorial {
  public int compute(int number) {
    int result ;

    if (number < 0) {
      throw new RuntimeException() ;
    } if ((number == 0) || (number == 1)) {
      result = 1;
    } else {
      result = number * compute(number - 1) ;
    }
    return result ;
  }
}
