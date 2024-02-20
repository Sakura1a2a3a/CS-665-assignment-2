/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Driver.java
 * Description: This is an abstract class and implement Observer interface
 */

package edu.bu.met.cs665;

/**
 * This is the Driver class.
 */

public abstract class Driver implements Observer {

  protected final String name;

  /**
   * The constructor.
   * Include driver's name.
   */

  public Driver(String name) {
    this.name = name;
  }


}
