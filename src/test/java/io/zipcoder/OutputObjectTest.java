//package io.zipcoder;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.HashMap;
//
//import static org.junit.Assert.*;
//
//public class OutputObjectTest {
//
//    OutputObject output;
//    @Before
//    public void setUp() {
//        output = new OutputObject();
//    }
//
//    @Test
//    public void getAndSetPriceAndOccurrenceCountTest() {
//        HashMap<Double, Integer> expected = new HashMap<Double, Integer>();
//        expected.put(2.14, 3);
//        output.setPriceAndOccurrenceCount(2.14, 3);
//        HashMap<Double, Integer> actual = output.getPriceAndOccurrenceCount();
//        Assert.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void getSeenCountTest() throws Exception {
//        output.setPriceAndOccurrenceCount(3.45, 2);
//        Integer expected = 2;
//        Integer actual = output.getSeenCount(3.45);
//        Assert.assertEquals(expected, actual);
//    }
//
//}
