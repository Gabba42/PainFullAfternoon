package io.zipcoder;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    Item itemTest;
    @Before
    public void setUpTest() throws Exception {
        itemTest = new Item("Milk", 3.36, "Food", "11/26/2017");
    }

    @Test
    public void getNameTest() throws Exception {
        String expected = "Milk";
        String actual = itemTest.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getPriceTest() throws Exception {
        Double expected = 3.36;
        Double actual = itemTest.getPrice();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getTypeTest() throws Exception {
        String expected = "Food";
        String actual = itemTest.getType();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getExpirationTest() throws Exception {
        String expected = "11/26/2017";
        String actual = itemTest.getExpiration();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toStringTest() throws Exception {
        String expected = "name:Milk price:3.36 type:Food expiration:11/26/2017";
        String actual = itemTest.toString();
        Assert.assertEquals(expected, actual);
    }
}