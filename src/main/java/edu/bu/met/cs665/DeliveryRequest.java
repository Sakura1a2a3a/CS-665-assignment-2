/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: DeliveryRequest.java
 * Description: This is a discrete class for requested delivery
 */

package edu.bu.met.cs665;

import java.sql.Timestamp;

/**
 * This is the DeliveryRequest class.
 */
public class DeliveryRequest {
  private String destination;
  private Timestamp time;

  private String product;

  /**
   * The constructor.
   * Include destination, product name, and time to arrival as information.
   */
  public DeliveryRequest(String destination, String product) {
    this.destination = destination;
    this.product = product;
    this.time = new Timestamp(System.currentTimeMillis() + 3600 * 1000);
  }

  /**
   * The toString method for request.
   * print out destination, product name, and time to arrival as information
   */
  @Override
  public String toString() {
    return "DeliveryRequest: "
        + "destination is at " + destination
        + ", product is " + product
        + ", and the arrival time is "
        + time
        + '.';
  }
}

