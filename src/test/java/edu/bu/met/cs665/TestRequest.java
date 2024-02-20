package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestRequest {

  @Test
  public void driverTest() {
    Driver van = new Van("driver1");
    assertEquals("driver1", van.name);
  }

  @Test
  public void updateTest() {
    Driver van = new Van("driver1");
    DeliveryRequest request = new DeliveryRequest("BU", "McDonald");
    assertEquals(("driver1, Van, accept DeliveryRequest: destination is at BU, product is McDonald, and the arrival "
        + "time is 2024-02-16 22:28:39.507.").substring(0, 30), van.update(request).substring(0, 30));
  }

  @Test
  public void attachTest() {
    Shop shop = new Shop();
    Driver van = new Van("driver1");
    Driver taxi = new Taxi("driver2");
    shop.attach(van);
    shop.attach(taxi);
    assertEquals(2, shop.checkLength());
  }

  @Test
  public void detachTest() {
    Shop shop = new Shop();
    Driver van = new Van("driver1");
    shop.attach(van);
    shop.detach(van);
    assertEquals(0, shop.checkLength());
  }


}
