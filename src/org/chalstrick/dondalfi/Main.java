package org.chalstrick.dondalfi;

public class Main {

  public static void main(String args[]) {
    System.out.println(Main.class.getSimpleName()
        + " was called with the following params:");
    for (String p : args)
      System.out.println("param: " + p);

    System.out.println("Now I start calling multiply");
    System.out.println("Multiplyer.multiply(3,4)="
        + new Multiplyer().multiply(3, 4));
  }
}
