/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Subject.java
 * Description: This is a Subject interface.
 */

package edu.bu.met.cs665;

/**
 * This is the subject interface.
 */
public interface Subject {

  /**
   * attach method needs to be implemented.
   */
  void attach(Observer driver);

  /**
   * detach method needs to be implemented.
   */
  void detach(Observer driver);

  /**
   * notify method needs to be implemented.
   */
  void notify(DeliveryRequest request);

}
