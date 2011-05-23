package org.chalstrick.dondalfi;

public class Main {

  public static void main(String args[]) {
    System.out.println(Main.class.getSimpleName()
        + " was called with the following params:");
    for (String p : args)
      System.out.println("param: " + p);
    
    System.out.println("Adder.add(3, 7)="+new Adder().add(3, 7));
  }
}
