package org.launchcode.java.demos.lsn6inheritance.test;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.Before;
import org.launchcode.java.demos.lsn6inheritance.Cat;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;


public class CatTests {
    HouseCat whatAGoodBoy;

    @Before
    public void createANewHouseCat(){
        whatAGoodBoy = new HouseCat("Steven", 15);
    }

    @Test
    public void inheritsCorrectly(){
        assertEquals(15, whatAGoodBoy.getWeight(), .001);
    }

}
