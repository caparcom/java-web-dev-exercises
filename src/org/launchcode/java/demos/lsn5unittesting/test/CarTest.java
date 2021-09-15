package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class CarTest {
    Car test_Car;

    @Before
    public void createCarObject(){
        test_Car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){
        assertEquals(10, test_Car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void tankLevelAccuracyWithinRange(){
        test_Car.drive(50);
        assertEquals(9, test_Car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void tankLevelAccuracyPassedRange(){
        test_Car.drive(1001);
        assertEquals(0, test_Car.getGasTankLevel(), .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    @Test (expected = IllegalArgumentException.class)
    public void testGasOverfill(){
        test_Car.addGas(50);
        fail("Hard no. The vehicle can't have more gas than the size of the tank.");
    }

}
