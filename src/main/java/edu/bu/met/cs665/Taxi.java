/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Taxi.java
 * Description: This is a discrete class which extends Driver class.
 */

package edu.bu.met.cs665;

/**
 * This is the Taxi class.
 */
public class Taxi extends Driver {

  /**
   * This is constructor with name.
   */
  public Taxi(String name) {
    super(name);
  }

  /**
   * Implementation of update method.
   */
  @Override
  public String update(DeliveryRequest request) {
    return name + ", Van, accept " + request;
  }
}
