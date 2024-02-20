/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Main.java
 * Description: Client class
 */

package edu.bu.met.cs665;


/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * The entrance of the program, client class to test.
   */
  public static void main(String[] args) {
    Shop shop = new Shop();
    shop.attach(new Taxi("number 1"));
    shop.attach(new Taxi("number 2"));
    shop.attach(new Van("number 3"));
    shop.attach(new Van("number 4"));
    shop.attach(new Taxi("number 5"));
    DeliveryRequest request = new DeliveryRequest("Boston University", "McDonald");
    shop.notify(request);
  }


}
