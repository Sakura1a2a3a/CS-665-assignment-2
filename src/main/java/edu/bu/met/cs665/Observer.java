/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Observer.java
 * Description: This is an interface for Observer
 */

package edu.bu.met.cs665;

/**
 * This is the Observer interface.
 */

public interface Observer {

  /**
   * The update method, needed to implement.
   */
  String update(DeliveryRequest request);
}
