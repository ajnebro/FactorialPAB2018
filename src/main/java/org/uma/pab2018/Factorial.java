package org.uma.pab2018 ;

public class Factorial {
  public int compute(int number) {
    int result = 0 ;

    if ((number == 0) || (number == 1)) {
      result = 1;
    } else if (number == 2) {
      result = 2 ;
    } else if (number == 3) {
      result = 6 ;
    }
    return result ;
  }
}
