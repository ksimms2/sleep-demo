package edu.cnm.deepdive;

public class MultipleThread {

  public static void main(String[] args) {
    Thread lazy = new LazyThread();//LazyThread is the instance type,Thread to the left of (=) is the reference type
    lazy.start();
    Utility.processInput();

  }


}
