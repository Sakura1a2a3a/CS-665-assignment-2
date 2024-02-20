/**
 * Name: Lingxiao Li
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/16/2024
 * File Name: Shop.java
 * Description: This is a discrete class implements Subject interface
 */

package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the Shop class.
 */
public class Shop implements Subject {
  private List<Observer> driverList;

  /**
   * The construct, initialize an arrayList.
   */
  public Shop() {
    driverList = new ArrayList<>();
  }

  /**
   * attach method to add one driver to the list.
   */
  @Override
  public void attach(Observer driver) {
    driverList.add(driver);
  }

  /**
   * detach method to remove one driver to the list.
   */
  @Override
  public void detach(Observer driver) {
    driverList.remove(driver);
  }

  /**
   * notify method to iterate the list and let them update.
   */
  @Override
  public void notify(DeliveryRequest request) {
    for (Observer driver : driverList) {
      System.out.println(driver.update(request));
    }

  }

  /**
   * check the current length of driverLength.
   */
  public int checkLength() {
    return driverList.size();
  }

}
