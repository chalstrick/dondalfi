package org.chalstrick.dondalfi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestMultiplyer {

  private Multiplyer mult;

  @Before
  public void setup() {
    mult = new Multiplyer();
  }

  @Test
  public void testMultiply() {
    assertEquals(77, mult.multiply(11, 7));
    assertEquals(0, mult.multiply(0, 0));
    assertEquals(-6, mult.multiply(3, -2));
  }
}
