package org.chalstrick.dondalfi;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class AdderTest {
  private Adder adder;

  @Before
  public void setup() {
    adder=new Adder();
  }

  @Test
  public void testAdd() {
    assertEquals(3, adder.add(1, 2));
    assertEquals(0, adder.add(0, 0));
    assertEquals(-5, adder.add(12, -17));
  }
}
