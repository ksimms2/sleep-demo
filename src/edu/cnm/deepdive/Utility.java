package edu.cnm.deepdive;

import java.util.Scanner;

public class Utility {

  static void processInput(){
    Scanner scanner = new Scanner(System.in);

    while (true){
      String input = scanner.nextLine().trim();
      if (!input.isEmpty()){
        System.out.println(input.toUpperCase());
      }
    }

  }

  static void takeNap(long duration){
    try {
      System.out.printf("Going to sleep for %.2f seconds\u2026%n", duration / 1000d); //u2026 is (...)
      Thread.sleep(duration);
    } catch (InterruptedException e) {
      // DO NOTHING! ---- deliberately choosing to ignore exception, must be inserted for tests(catch block)
    } finally {
      System.out.println("\u2026waking up now!");
    }
  }
}
