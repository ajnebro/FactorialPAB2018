package org.uma.pab2018;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class ListTest {

  @Test
  public void prueba() {
    List list = mock(List.class) ;

    when(list.get(0)).thenReturn("first", "second");

    String result = (String) list.get(0);
    String result2 = (String) list.get(0);

    assertEquals("first", result) ;
    verify(list, times(2)).get(0) ;
  }
}
