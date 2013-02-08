package org.chalstrick.dondalfi;

public class Main {

  public static void main(String args[]) {
    System.out.println(Main.class.getSimpleName()
        + " was called with the following params:");
    for (String p : args)
      System.out.println("param: " + p);
  }
  // some dummy comment
  // some dummy comment2 3
}
